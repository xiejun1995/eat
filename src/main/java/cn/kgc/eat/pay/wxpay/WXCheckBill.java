package cn.kgc.eat.pay.wxpay;

import java.util.HashMap;
import java.util.Map;

/**
 * 核对账单
 * @author 谢军军
 * @Email 18045972801@163.com
 * @date 2020/2/27 19:34
 */
public class WXCheckBill {
    public static void main(String[] args) throws Exception {

        MyWXConfig config = new MyWXConfig();
        WXPay wxpay = new WXPay(config);

        Map<String, String> data = new HashMap<String, String>();
        data.put("bill_date", "20140603");
        data.put("bill_type", "ALL");

        try {
            Map<String, String> resp = wxpay.downloadBill(data);
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
