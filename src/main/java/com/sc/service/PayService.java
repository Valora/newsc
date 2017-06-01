package com.sc.service;

import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.domain.AlipayTradeAppPayModel;
import com.alipay.api.request.AlipayTradeAppPayRequest;
import com.alipay.api.response.AlipayTradeAppPayResponse;
import com.github.binarywang.wxpay.bean.request.WxPayUnifiedOrderRequest;
import com.github.binarywang.wxpay.service.WxPayService;
import com.github.binarywang.wxpay.service.impl.WxPayServiceImpl;
import com.sc.config.AliPayConfig;
import com.sc.domain.generator.OrdersWithBLOBs;
import com.sc.domain.generator.Pays;
import com.sc.mapper.generator.PaysMapper;
import com.sc.mapper.pay.PayMapper;
import com.sc.utils.DateUtils;
import com.sc.utils.GetRandomNumber;
import com.sc.utils.GetResult;
import com.sc.utils.PayUtils;
import com.sc.utils.Result;
import me.chanjar.weixin.common.util.RandomUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;

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
    public PayService(PayMapper payMapper, WxPayService wxPayService, PaysMapper paysMapper) {
        this.payMapper = payMapper;
        this.paysMapper = paysMapper;
    }

    /**
     * 微信支付APP用
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
            //签名
            orderRequest.setSign(PayUtils.createSign());
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
            //签名
            orderRequest.setSign(PayUtils.createSign());
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

            String url =  "/WechatPay/MakeQRCode.aspx?data=" + wxPayService.unifiedOrder(orderRequest).getCodeURL();
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
            double totalFee =  (moneysum - score);
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
                    payMapper.updateTableOrderAli(order.getCmOrderid());
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
}
