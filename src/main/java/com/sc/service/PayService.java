package com.sc.service;

import com.alipay.api.AlipayApiException;
import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.domain.AlipayTradeAppPayModel;
import com.alipay.api.internal.util.AlipaySignature;
import com.alipay.api.request.AlipayTradeAppPayRequest;
import com.alipay.api.response.AlipayTradeAppPayResponse;
import com.github.binarywang.wxpay.bean.request.WxPayUnifiedOrderRequest;
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
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

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
import java.util.HashMap;
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

    @Value("${wechat.pay.notifyUrl}")
    private String NOTIFY_URL;

    @Value("${wechat.pay.ip}")
    private String IP;

    @Value("${wechat.pay.mchId}")
    private String MCHID;

    @Value("${wechat.pay.appId}")
    private String APPID;

    @Value("${wechat.pay.mchKey}")
    private String MCHKEY;

    @Value("${wechat.pay.appSecret}")
    private String APPSECREST;

    @Value("${wechat.pay.proxyUrl}")
    private String PROXY_URL;

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
    public Result wechatPayApp(String orderids) {
        try {
            WxPayService wxPayService = new WxPayServiceImpl();
            String[] arr = orderids.split("|");
            List<OrdersWithBLOBs> orders = payMapper.getOrderByOrderIds(arr);
            if (orders.size() <= 0) {
                return GetResult.toJson(63, null, null, null, 0);
            }
            double moneysum = orders.stream().mapToDouble(t -> (t.getCmMoneysun() - t.getCmUserbalance())).sum();
            double score = orders.stream().mapToDouble(t -> t.getCmUsescore()).sum() * 0.01;
            int totalFee = (int) ((moneysum - score) * 100);

            WxPayUnifiedOrderRequest orderRequest = new WxPayUnifiedOrderRequest();
            //公众账号ID
            orderRequest.setAppid(APPID);
            //商户号
            orderRequest.setMchId(MCHID);
            //随机字符串
            orderRequest.setNonceStr(RandomUtils.getRandomStr());
            //商品描述
            orderRequest.setBody("消费");
            //商户订单号
            orderRequest.setOutTradeNo(PayUtils.generateOutTradeNo());
            //标价金额
            orderRequest.setTotalFee(totalFee);
            //终端IP
            orderRequest.setSpbillCreateIp(IP);
            //通知地址
            orderRequest.setNotifyURL(NOTIFY_URL);
            //交易类型
            orderRequest.setTradeType("APP");
            //开始时间
            orderRequest.setTimeStart(DateUtils.todayYyyyMmDdHhMmSs());
            //过期时间
            orderRequest.setTimeExpire(LocalDateTime.now().plusMinutes(10).format(DateTimeFormatter.ofPattern("yyyyMMddHHmmss")));
            //附加数据
            orderRequest.setAttach(orderids);
            XStream xStream = new XStream();
            //签名
            orderRequest.setSign(SignUtils.createSign(xStream.toXML(orderRequest), MCHKEY));
            
            String payjson = PayUtils.getPayJson(wxPayService.unifiedOrder(orderRequest));
            try {
                Date time = new Date();
                for (OrdersWithBLOBs order : orders) {
                    Pays pays = new Pays();
                    pays.setCmPaytype(4);
                    pays.setCmPayjson(payjson);
                    pays.setCmOrderid(order.getCmOrderid());
                    pays.setCmTime(time);
                    paysMapper.insertSelective(pays);
                    payMapper.updateTableOrder(order.getCmOrderid());
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            return GetResult.toJson(0, null, null, payjson, 0);

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
    public Result wechatPayPC(String orderids) {
        try {
            WxPayService wxPayService = new WxPayServiceImpl();
            String[] arr = orderids.split("|");
            List<OrdersWithBLOBs> orders = payMapper.getOrderByOrderIds(arr);
            if (orders.size() <= 0) {
                return GetResult.toJson(63, null, null, null, 0);
            }
            double moneysum = orders.stream().mapToDouble(t -> (t.getCmMoneysun() - t.getCmUserbalance())).sum();
            double score = orders.stream().mapToDouble(t -> t.getCmUsescore()).sum() * 0.01;
            int totalFee = (int) ((moneysum - score) * 100);
            WxPayUnifiedOrderRequest orderRequest = new WxPayUnifiedOrderRequest();
            //公众账号ID
            orderRequest.setAppid(APPID);
            //商户号
            orderRequest.setMchId(MCHID);
            //随机字符串
            orderRequest.setNonceStr(RandomUtils.getRandomStr());
            //商品描述
            orderRequest.setBody("消费");
            //商户订单号
            orderRequest.setOutTradeNo(PayUtils.generateOutTradeNo());
            //标价金额
            orderRequest.setTotalFee(totalFee);
            //终端IP
            orderRequest.setSpbillCreateIp(IP);
            //通知地址
            orderRequest.setNotifyURL(NOTIFY_URL);
            //交易类型
            orderRequest.setTradeType("NATIVE");
            //开始时间
            orderRequest.setTimeStart(DateUtils.todayYyyyMmDdHhMmSs());
            //过期时间
            orderRequest.setTimeExpire(LocalDateTime.now().plusMinutes(10).format(DateTimeFormatter.ofPattern("yyyyMMddHHmmss")));
            //附加数据
            orderRequest.setAttach(orderids);
            XStream xStream = new XStream();
            //签名
            orderRequest.setSign(SignUtils.createSign(xStream.toXML(orderRequest), MCHKEY));

            String url = "/WechatPay/MakeQRCode.aspx?data=" + wxPayService.unifiedOrder(orderRequest).getCodeURL();
            try {
                Date time = new Date();
                for (OrdersWithBLOBs order : orders) {
                    Pays pays = new Pays();
                    pays.setCmPaytype(4);
                    pays.setCmPayjson(url);
                    pays.setCmOrderid(order.getCmOrderid());
                    pays.setCmTime(time);
                    paysMapper.insertSelective(pays);
                    payMapper.updateTableOrder(order.getCmOrderid());
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
    public Result aliPayApp(String orderids) {
        try {
            String[] arr = orderids.split("|");
            List<OrdersWithBLOBs> orders = payMapper.getOrderByOrderIds(arr);
            if (orders.size() <= 0) {
                return GetResult.toJson(63, null, null, null, 0);
            }
            double moneysum = orders.stream().mapToDouble(t -> (t.getCmMoneysun() - t.getCmUserbalance())).sum();
            double score = orders.stream().mapToDouble(t -> t.getCmUsescore()).sum() * 0.01;
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
                    pays.setCmPaytype(1);
                    pays.setCmPayjson(payjson);
                    pays.setCmOrderid(order.getCmOrderid());
                    pays.setCmTime(time);
                    paysMapper.insertSelective(pays);
                    payMapper.updateTableOrder(order.getCmOrderid());
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
     * 阿里异步通知
     *
     * @param request
     * @param response
     */
    public void aliNotify(HttpServletRequest request, HttpServletResponse response) throws AlipayApiException {
        //获取支付宝POST过来反馈信息
        Map<String, String> params = new HashMap<>();
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
    public void wxNotify(HttpServletRequest request, HttpServletResponse response) throws IOException, Exception {
        //读取参数  
        InputStream inputStream ;
        StringBuffer sb = new StringBuffer();
        inputStream = request.getInputStream();
        String s ;
        BufferedReader in = new BufferedReader(new InputStreamReader(inputStream, "UTF-8"));
        while ((s = in.readLine()) != null){
            sb.append(s);
        }
        in.close();
        inputStream.close();

        //解析xml成map
        XStream xStream = new XStream();
        Map<String, String> m;
        m = (Map<String, String>) xStream.fromXML(sb.toString());

        //过滤空 设置 TreeMap  
        SortedMap<Object,Object> packageParams = new TreeMap<>();
        Iterator it = m.keySet().iterator();
        while (it.hasNext()) {
            String parameter = (String) it.next();
            String parameterValue = m.get(parameter);

            String v = "";
            if(null != parameterValue) {
                v = parameterValue.trim();
            }
            packageParams.put(parameter, v);
        }

        // 账号信息  
        String key = MCHKEY; //key  

        //判断签名是否正确  
        if(SignUtils.checkSign(packageParams,key)) {
            //------------------------------  
            //处理业务开始  
            //------------------------------  
            String resXml = "";
            if("SUCCESS".equals(packageParams.get("result_code"))){
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
        } else{
            System.out.println("通知签名验证失败");
        }
    }
}
