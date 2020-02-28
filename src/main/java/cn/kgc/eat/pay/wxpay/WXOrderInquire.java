package cn.kgc.eat.pay.wxpay;

import java.util.HashMap;
import java.util.Map;

/**
 * 订单查询类
 * @author 谢军军
 * @Email 18045972801@163.com
 * @date 2020/2/27 18:56
 */
public class WXOrderInquire {
    public static void main(String[] args) throws Exception {
        MyWXConfig config = new MyWXConfig();
        WXPay wxpay = new WXPay(config);
        Map<String, String> data = new HashMap<String, String>();
        data.put("out_trade_no", "1001");
        try {
            Map<String, String> resp = wxpay.orderQuery(data);
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
