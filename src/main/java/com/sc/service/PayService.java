package com.sc.service;

import com.alibaba.fastjson.JSON;
import com.alipay.api.AlipayApiException;
import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.domain.AlipayTradeAppPayModel;
import com.alipay.api.internal.util.AlipaySignature;
import com.alipay.api.request.AlipayTradeAppPayRequest;
import com.alipay.api.request.AlipayTradePagePayRequest;
import com.alipay.api.response.AlipayTradeAppPayResponse;
import com.github.binarywang.wxpay.bean.request.WxPayUnifiedOrderRequest;
import com.github.binarywang.wxpay.config.WxPayConfig;
import com.github.binarywang.wxpay.service.WxPayService;
import com.github.binarywang.wxpay.service.impl.WxPayServiceImpl;
import com.github.binarywang.wxpay.util.SignUtils;
import com.sc.config.AliPayConfig;
import com.sc.domain.generator.OrdersWithBLOBs;
import com.sc.domain.generator.Pays;
import com.sc.mapper.generator.PaysMapper;
import com.sc.mapper.pay.PayMapper;
import com.sc.utils.DateUtils;
import com.sc.utils.GetRandomNumber;
import com.sc.utils.GetResult;
import com.sc.utils.Result;
import com.sc.utils.pay.PayUtils;
import com.thoughtworks.xstream.XStream;
import me.chanjar.weixin.common.util.RandomUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

/**
 * 支付用
 * Created by valora on 2017/5/31.
 */
@Service
public class PayService {
    private final PayMapper payMapper;

    //异步接收微信支付结果通知的回调地址
    private final static String WX_NOTIFY_URL = "http://106.15.38.42:8080/wxnotify";

    //APP和网页支付提交用户端ip
    private final static String WX_IP = "8.8.8.8";

    //微信支付分配的商户号
    private final static String WX_MCHID = "1461584902";

    //微信支付分配的公众账号ID
    private final static String WX_APPID = "wxdc1d4d16f56b3c77";

    //账号密钥
    private final static String WX_MCHKEY = "taizhouhanliankejitzhlkj12345678";

    //微信密钥
    private final static String WX_APPSECREST = "7056583bc53be38a8ad16cc911aecb40";

    //通知地址
    private final static String WX_PROXY_URL = "http://106.15.38.42:8080";

    private final PaysMapper paysMapper;

    @Autowired
    public PayService(PayMapper payMapper, PaysMapper paysMapper) {
        this.payMapper = payMapper;
        this.paysMapper = paysMapper;
    }

    /**
     * 微信支付APP用
     *
     * @param orderids 订单号列表
     * @return
     */
    @Transactional(isolation = Isolation.REPEATABLE_READ)
    public Result wechatPayApp(String orderids) {
        try {
            //payService初始化
            WxPayConfig payConfig = new WxPayConfig();
            payConfig.setMchKey(WX_MCHKEY);
            payConfig.setMchId(WX_MCHID);
            payConfig.setAppId(WX_APPID);
            payConfig.setNotifyUrl(WX_NOTIFY_URL);
            payConfig.setTradeType("APP");
            WxPayService wxPayService = new WxPayServiceImpl();
            wxPayService.setConfig(payConfig);

            XStream xStream = new XStream();
            //订单号处理
            String[] arr = orderids.split("\\|");
            List<OrdersWithBLOBs> orders = payMapper.getOrderByOrderIds(arr);
            if (orders.size() <= 0) {
                return GetResult.toJson(63, null, null, null, 0);
            }
            //订单金额
            double moneysum = orders.stream().mapToDouble(t -> (t.getCM_MONEYSUN() - t.getCM_USERBALANCE())).sum();
            //使用积分
            double score = orders.stream().mapToDouble(t -> t.getCM_USESCORE()).sum() * 0.01;
            //应付金额（以分为单位）
            int totalFee = (int) ((moneysum - score) * 100);

            WxPayUnifiedOrderRequest orderRequest = new WxPayUnifiedOrderRequest();
            //随机字符串
            orderRequest.setNonceStr(RandomUtils.getRandomStr());
            //商品描述
            orderRequest.setBody("消费");
            //商户订单号
            orderRequest.setOutTradeNo(PayUtils.generateOutTradeNo());
            //标价金额
            orderRequest.setTotalFee(totalFee);
            //终端IP
            orderRequest.setSpbillCreateIp(WX_IP);
            //开始时间
            orderRequest.setTimeStart(DateUtils.todayYyyyMmDdHhMmSs());
            //过期时间
            orderRequest.setTimeExpire(LocalDateTime.now().plusMinutes(10).format(DateTimeFormatter.ofPattern("yyyyMMddHHmmss")));
            //附加数据
            orderRequest.setAttach(orderids);
            //签名
            orderRequest.setSign(SignUtils.createSign(xStream.toXML(orderRequest), WX_MCHKEY));

            String payjson = PayUtils.getPayJson(wxPayService.unifiedOrder(orderRequest));
            try {
                Date time = new Date();
                for (OrdersWithBLOBs order : orders) {
                    Pays pays = new Pays();
                    pays.setCM_PAYTYPE(4);
                    pays.setCM_PAYJSON(payjson);
                    pays.setCM_ORDERID(order.getCM_ORDERID());
                    pays.setCM_TIME(time);
                    paysMapper.insertSelective(pays);
                    payMapper.updateTableOrder(order.getCM_ORDERID());
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            Map<String, String> result = (Map<String, String>) JSON.parse(payjson);
            return GetResult.toJson(0, null, null, result, 0);

        } catch (Exception e) {
            return GetResult.toJson(200, null, null, null, 0);
        }
    }

    /**
     * 微信支付PC用
     *
     * @param orderids 订单号列表
     * @return
     */
    @Transactional(isolation = Isolation.REPEATABLE_READ)
    public Result wechatPayPC(String orderids) {
        try {
            //payService初始化
            WxPayConfig payConfig = new WxPayConfig();
            payConfig.setMchKey(WX_MCHKEY);
            payConfig.setMchId(WX_MCHID);
            payConfig.setAppId(WX_APPID);
            payConfig.setNotifyUrl(WX_NOTIFY_URL);
            payConfig.setTradeType("NATIVE");
            WxPayService wxPayService = new WxPayServiceImpl();
            wxPayService.setConfig(payConfig);

            XStream xStream = new XStream();
            String[] arr = orderids.split("\\|");
            List<OrdersWithBLOBs> orders = payMapper.getOrderByOrderIds(arr);
            if (orders.size() <= 0) {
                return GetResult.toJson(63, null, null, null, 0);
            }
            double moneysum = orders.stream().mapToDouble(t -> (t.getCM_MONEYSUN() - t.getCM_USERBALANCE())).sum();
            double score = orders.stream().mapToDouble(t -> t.getCM_USESCORE()).sum() * 0.01;
            int totalFee = (int) ((moneysum - score) * 100);
            WxPayUnifiedOrderRequest orderRequest = new WxPayUnifiedOrderRequest();
            //随机字符串
            orderRequest.setNonceStr(RandomUtils.getRandomStr());
            //商品描述
            orderRequest.setBody("消费");
            //商户订单号
            orderRequest.setOutTradeNo(PayUtils.generateOutTradeNo());
            //标价金额
            orderRequest.setTotalFee(totalFee);
            //终端IP
            orderRequest.setSpbillCreateIp(WX_IP);
            //开始时间
            orderRequest.setTimeStart(DateUtils.todayYyyyMmDdHhMmSs());
            //过期时间
            orderRequest.setTimeExpire(LocalDateTime.now().plusMinutes(10).format(DateTimeFormatter.ofPattern("yyyyMMddHHmmss")));
            //附加数据
            orderRequest.setAttach(orderids);
            //签名
            orderRequest.setSign(SignUtils.createSign(xStream.toXML(orderRequest), WX_MCHKEY));
            //商品ID
            orderRequest.setProductId(DateUtils.todayYyyyMmDdHhMmSs() + GetRandomNumber.genRandomNum(4));

            String url = "/WechatPay/MakeQRCode.aspx?data=" + wxPayService.unifiedOrder(orderRequest).getCodeURL();
            try {
                Date time = new Date();
                for (OrdersWithBLOBs order : orders) {
                    Pays pays = new Pays();
                    pays.setCM_PAYTYPE(4);
                    pays.setCM_PAYJSON(url);
                    pays.setCM_ORDERID(order.getCM_ORDERID());
                    pays.setCM_TIME(time);
                    paysMapper.insertSelective(pays);
                    payMapper.updateTableOrder(order.getCM_ORDERID());
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            return GetResult.toJson(0, null, null, url, 0);
        } catch (Exception e) {
            e.printStackTrace();
            return GetResult.toJson(200, null, null, null, 0);
        }
    }

    /**
     * 支付宝用
     *
     * @param orderids 订单列表
     * @return
     */
    @Transactional(isolation = Isolation.REPEATABLE_READ)
    public Result aliPayApp(String orderids) {
        try {
            String[] arr = orderids.split("\\|");
            List<OrdersWithBLOBs> orders = payMapper.getOrderByOrderIds(arr);
            if (orders.size() <= 0) {
                return GetResult.toJson(63, null, null, null, 0);
            }
            double moneysum = orders.stream().mapToDouble(t -> (t.getCM_MONEYSUN() - t.getCM_USERBALANCE())).sum();
            double score = orders.stream().mapToDouble(t -> t.getCM_USESCORE()).sum() * 0.01;
            double totalFee = (moneysum - score);
            String aliorderid = DateUtils.todayYyyyMmDdHhMmSs() + GetRandomNumber.genRandomNum(3);
            AlipayClient alipayClient = new DefaultAlipayClient("https://openapi.alipay.com/gateway.do", AliPayConfig.APPID, AliPayConfig.APPPRIVATEKEY, "json", AliPayConfig.CHARSET, AliPayConfig.ALIPAYPUBLICKEY, "RSA2");
            AlipayTradeAppPayRequest request = new AlipayTradeAppPayRequest();
            AlipayTradeAppPayModel model = new AlipayTradeAppPayModel();
            model.setBody("消费");
            model.setSubject("童E家");
            model.setOutTradeNo(aliorderid);
            model.setTimeoutExpress("30m");
            model.setTotalAmount(Double.toString(totalFee));
            model.setProductCode("QUICK_MSECURITY_PAY");
            request.setBizModel(model);
            request.setNotifyUrl(AliPayConfig.NOTIFYURL);
            try {
                AlipayTradeAppPayResponse response = alipayClient.sdkExecute(request);
                String payjson = response.getBody();
                Date time = new Date();
                for (OrdersWithBLOBs order : orders) {
                    Pays pays = new Pays();
                    pays.setCM_PAYTYPE(1);
                    pays.setCM_PAYJSON(payjson);
                    pays.setCM_ORDERID(order.getCM_ORDERID());
                    pays.setCM_TIME(time);
                    paysMapper.insertSelective(pays);
                    payMapper.updateTableOrder(order.getCM_ORDERID());
                }
                return GetResult.toJson(0, null, null, payjson, 0);
            } catch (Exception e) {
                e.printStackTrace();
                return GetResult.toJson(200, null, null, null, 0);
            }
        } catch (Exception e) {
            return GetResult.toJson(200, null, null, null, 0);
        }
    }

    /**
     * 支付宝(PC)
     *
     * @param request
     * @param response
     * @return
     */
    @Transactional(isolation = Isolation.REPEATABLE_READ)
    public void aliPayPc(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        //获得订单号计算订单金额
        String orderids = request.getParameter("orderids");
        String[] arr = orderids.split("\\|");
        List<OrdersWithBLOBs> orders = payMapper.getOrderByOrderIds(arr);
        if (orders.size() > 0) {

            double moneysum = orders.stream().mapToDouble(t -> (t.getCM_MONEYSUN() - t.getCM_USERBALANCE())).sum();
            double score = orders.stream().mapToDouble(t -> t.getCM_USESCORE()).sum() * 0.01;
            double totalFee = (moneysum - score);
            String aliorderid = DateUtils.todayYyyyMmDdHhMmSs() + GetRandomNumber.genRandomNum(3);
            //获得初始化的AlipayClient
            AlipayClient alipayClient = new DefaultAlipayClient("https://openapi.alipay.com/gateway.do", AliPayConfig.APPID, AliPayConfig.APPPRIVATEKEY, "json", AliPayConfig.CHARSET, AliPayConfig.ALIPAYPUBLICKEY, AliPayConfig.SIGN_TYPE);
            AlipayTradePagePayRequest alipayRequest = new AlipayTradePagePayRequest();//创建API对应的request
            //todo
            alipayRequest.setNotifyUrl(AliPayConfig.NOTIFYURL);//在公共参数中设置回跳和通知地址
            alipayRequest.setBizContent("{" +
                    "    \"out_trade_no\":\"" + aliorderid + "\"," +
                    "    \"product_code\":\"QUICK_MSECURITY_PAY\"," +
                    "    \"total_amount\":" + totalFee + "," +
                    "    \"subject\":\"童E家\"," +
                    "    \"body\":\"消费\"," +
                    "    \"extend_params\":{" +
                    "    \"sys_service_provider_id\":\"" + orderids + "\"" +
                    "    }" +
                    "  }");//填充业务参数
            String form = "";
            try {
                form = alipayClient.pageExecute(alipayRequest).getBody(); //调用SDK生成表单
                for (OrdersWithBLOBs order : orders) {
                    Pays pays = new Pays();
                    pays.setCM_PAYTYPE(2);
                    pays.setCM_PAYJSON(form);
                    pays.setCM_ORDERID(order.getCM_ORDERID());
                    pays.setCM_TIME(new Date());
                    paysMapper.insertSelective(pays);
                    payMapper.updateTableOrderAliPay(order.getCM_ORDERID());
                }
            } catch (AlipayApiException e) {
                e.printStackTrace();
            }
            response.setContentType("text/html;charset=" + AliPayConfig.CHARSET);
            response.getWriter().write(form);//直接将完整的表单html输出到页面
            response.getWriter().flush();
            response.getWriter().close();
        }
    }

    /**
     * 阿里异步通知
     *
     * @param request
     * @param response
     */
    public void aliNotify(HttpServletRequest request, HttpServletResponse response) throws AlipayApiException {
        //获取支付宝POST过来反馈信息
        Map<String, String> params = new TreeMap<>();
        Map requestParams = request.getParameterMap();
        for (Object o : requestParams.keySet()) {
            String name = (String) o;
            String[] values = (String[]) requestParams.get(name);
            String valueStr = "";
            for (int i = 0; i < values.length; i++) {
                valueStr = (i == values.length - 1) ? valueStr + values[i]
                        : valueStr + values[i] + ",";
            }
            //乱码解决，这段代码在出现乱码时使用。
            //valueStr = new String(valueStr.getBytes("ISO-8859-1"), "utf-8");
            params.put(name, valueStr);
        }

        boolean flag = AlipaySignature.rsaCheckV1(params, AliPayConfig.ALIPAYPUBLICKEY, AliPayConfig.CHARSET, "RSA2");
        if (flag) {
            //逻辑处理
            String orderid = params.get("attach");
            OrdersWithBLOBs orders = payMapper.getOrderByOrderId(orderid);
            payMapper.updateTableOrder(orderid);
            payMapper.updateTableOrderDetail(orderid);
        }
    }

    /**
     * 微信异步通知
     *
     * @param request
     * @param response
     */
    public void wxNotify(HttpServletRequest request, HttpServletResponse response) throws Exception {
        //读取参数  
        InputStream inputStream;
        StringBuffer sb = new StringBuffer();
        inputStream = request.getInputStream();
        String s;
        BufferedReader in = new BufferedReader(new InputStreamReader(inputStream, "UTF-8"));
        while ((s = in.readLine()) != null) {
            sb.append(s);
        }
        in.close();
        inputStream.close();

        //解析xml成map
        XStream xStream = new XStream();
        Map<String, String> m;
        m = (Map<String, String>) xStream.fromXML(sb.toString());

        //过滤空 设置 TreeMap  
        SortedMap<Object, Object> packageParams = new TreeMap<>();
        Iterator it = m.keySet().iterator();
        while (it.hasNext()) {
            String parameter = (String) it.next();
            String parameterValue = m.get(parameter);

            String v = "";
            if (null != parameterValue) {
                v = parameterValue.trim();
            }
            packageParams.put(parameter, v);
        }

        // 账号信息  
        String key = WX_MCHKEY; //key  

        //判断签名是否正确  
        if (SignUtils.checkSign(packageParams, key)) {
            //------------------------------  
            //处理业务开始  
            //------------------------------  
            String resXml = "";
            if ("SUCCESS".equals(packageParams.get("result_code"))) {
                String orderid = (String) packageParams.get("attach");
                String money = (String) packageParams.get("total_fee");
                // 这里是支付成功  
                //////////执行自己的业务逻辑////////////////  
                payMapper.updateTableOrder(orderid);
                payMapper.updateTableOrderDetail(orderid);
//                payMapper.updateTableUser()
                //////////执行自己的业务逻辑////////////////
                System.out.println("支付成功");
                //通知微信.异步确认成功.必写.不然会一直通知后台.八次之后就认为交易失败了.  
                resXml = "<xml>" + "<return_code><![CDATA[SUCCESS]]></return_code>"
                        + "<return_msg><![CDATA[OK]]></return_msg>" + "</xml> ";

            } else {
                resXml = "<xml>" + "<return_code><![CDATA[FAIL]]></return_code>"
                        + "<return_msg><![CDATA[报文为空]]></return_msg>" + "</xml> ";
            }
            //------------------------------  
            //处理业务完毕  
            //------------------------------  
            BufferedOutputStream out = new BufferedOutputStream(
                    response.getOutputStream());
            out.write(resXml.getBytes());
            out.flush();
            out.close();
        } else {
            System.out.println("通知签名验证失败");
        }
    }
}
