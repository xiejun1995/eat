package cn.kgc.eat.pay.wxpay;

import java.util.HashMap;
import java.util.Map;

/**
 * 统一下单
 * @author 谢军军
 * @Email 18045972801@163.com
 * @date 2020/2/27 18:41
 */
public class WXOrderUniform {
    public static void main(String[] args) throws Exception {

        MyConfig config = new MyConfig();
        WXPay wxpay = new WXPay(config);

        Map<String, String> data = new HashMap<String, String>();
        //添加商品描述
        data.put("body", "吃了么下单");
        //添加商户订单号
        data.put("out_trade_no", "1001");
        //添加设备号
        data.put("device_info", "013467007045764");
        //添加货币类型
        data.put("fee_type", "CNY");
        //添加总金额
        data.put("total_fee", "1");
        //添加终端IP
        data.put("spbill_create_ip", "123.12.12.123");
        //添加通知地址
        data.put("notify_url", "http://localhost:8080/eat/wxpay/notify");
        //添加交易类型
        data.put("trade_type", "NATIVE");  // 此处指定为扫码支付
        //添加商品Id
        data.put("shopping_productid", "1");
        try {
            Map<String, String> resp = wxpay.unifiedOrder(data);
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
