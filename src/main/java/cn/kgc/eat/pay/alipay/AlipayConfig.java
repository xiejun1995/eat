package cn.kgc.eat.pay.alipay;

import java.io.FileWriter;
import java.io.IOException;

/* *
 *类名：AlipayConfig
 *功能：基础配置类
 *详细：设置帐户有关信息及返回路径
 *修改日期：2017-04-05
 *说明：
 *以下代码只是为了方便商户测试而提供的样例代码，商户可以根据自己网站的需要，按照技术文档编写,并非一定要使用该代码。
 *该代码仅供学习和研究支付宝接口使用，只是提供一个参考。
 */

public class AlipayConfig {
	
//↓↓↓↓↓↓↓↓↓↓请在这里配置您的基本信息↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓

	// 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号
	public static String app_id ="2016102100731377";
	
	// 商户私钥，您的PKCS8格式RSA2私钥
    public static String merchant_private_key = "MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQC3uS0OCBXUcvJMar1DVw90bKzcjLYcvEZH0RbL5wCsql8Nv2VJC5AsMn6Zl0Plnf8XyAmm8TSQU8QvTPB1gKvOQmkQvwqUf3iShTxMa4vnlejNEPkYplwACBd5gt8MeNJYimUToP7aOM/4AIa2Izh6aLVHYivG2FCMO2jrWPIGaH09fHVB2t1/thNVyPP1wdbosPEj8OgFmpKyORk6heLg9brxHZfUZjnKQdovJugjxP7kJrIBhTPQhuqvgbPuTmKb/Cdq8jTpY5V3f3b2DVNC0GA80xcLtTXLc8anbXsXHR/tcil/0zqYL7cZ3a+/Cne4a+M4yWfhgC74BnVi4QbvAgMBAAECggEAdXugZ/ybmQL4Fg2bgVhGtbhYwZ/pRG7QslPuM+0/7Sn1JqFhb1hJlTmk4yprbIWf/eEY6vwLFM+8AFM+4KSrOHYXIXJInbT1sRwp9uQ+zpR6DcfwweZ/pjWGbVlWsG8Cc0PsZqTo0zrJIlmTyxyynPQgF8mbHMhumX3UFcsG2TkajzkLVWc1vGKabFmd7lYCl/T8P2JduYa7ghiqHDC0rrf/0Ut0tf+xwFjgyycYUIx3LTmX0FbyKCr5B5Cu2Qk6pDtC+OvNJcFdwD/Uz4BwgOQq1/VZJ0TauQnvrla1H/sfr06zjmnnxi6Ubsy6iJWwTnI5pPFHCOCeMHpBsqN+oQKBgQDdpeQ3vJqZx7FLqKtzioA0JSkYE15DnNIm1pBGoDxO2Ch4debysG4R0yoSjiGb9hRKPQWs9sVWlrVcQ38lvPhpuJnATY6JzT+a8CKsw3Ia7bPfrhXUkmnoUoPgRitqsPfHz3C6az93Na2gVsxeegZRDLREVq6YKBVFwmECnq1ipQKBgQDUMpXBvrST8I7XkKYZ0aMfqSseKcXypi8WsubWCvAFRGrxveyMKNqRRw0Fi7bqP02A3al62mz3mJfPc3O4n/mDnkWl9YtQGz7cDJHOYUsAaxLmqyGILnzquJv8zyAUOAMW0D2S98KQ+ddGpSca2JMcmlpzkOQgkJb410cRrsozAwKBgD0Q33ebttx3cBlwNwx2NCwpsNC5RVdLdXrN0qIis3rlgwDtOtvSUAEJNKY4EnptqdlqRo4IzwW0L/NjhTxYe/hkq7eXppXAvq1pS6RdlKpmoxAVXl5amGMxmLPJoVybtSiPtncl5S5q05NBVr0Q0XyzC1doqmGxaWr2ytN19D8hAoGBALp57cNCjTyJJW5ozp9X7EtxhdPPEAbKZg1DkLo/CGkIlBb3Ob5+VH1g/B+IhWlb0gdSRJMTCrmXnqmPIv33j/VLjJdorlHqb5Y/cY71T00By61sbF5ZxCsdqu9DMkSyaHyO6d2S36g59yY9Ep1z/+wd9SkkBmZbymDKBsmSWlzzAoGBAMnxlkRgSBlvh7wdWyWxCpE9DOxgTYhx9jmW4k42ChUNL9uT8G+n6tw/8IYr4FzkGgKydQUKFY7NaA+OFckmfwV8pSSjbGpoIqO94ojBr7zmAkSvIIpttR7lWjtYVuBy+legmJD3aHMjy480F81q+cv8nVkzOL4o8sFrN2SdoSdx";
	
	// 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
    public static String alipay_public_key ="MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEA3bMSZNF+b/OkE19gbY/jOodKa9TMnJbLSnjZW/6pjg3Ztw+563cmrM+0CvyhuQ5E2vXavyCBkVGbn0oxYZ8C17cvYR+xWmp5WCTgphi/m0+FBQjDlxPtl56wCZlGMMFzN5g4OwtRCikj7GVa9eRVtuE2zuVD6W3uZQm557I/mM30Yc1FaUFrmdtZrBfCjcygWows4WXZtanta9wLmVsVxPR/diCB3djEVfDVrqI7Nomo7gfOtUnECXMDdYZcu22tIJd2KIdEJX7r1xMBqjt3OI9QJwwCDzH8vv2GD21PJTJ+rRbMr3+cMOLVq3vA+iukorAsszgFCGGqRD3Iwkd0iwIDAQAB";

	// 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	public static String notify_url = "http://localhost:8080/alipay/notify_url.jsp";

	// 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	public static String return_url = "http://localhost:8080/alipay/return_url.jsp";

	// 签名方式
	public static String sign_type = "RSA2";
	
	// 字符编码格式
	public static String charset = "utf-8";
	
	// 支付宝网关
	public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";
	
	// 支付宝网关
	public static String log_path = "H:\\360Downloads\\SoftWare\\alipay";


//↑↑↑↑↑↑↑↑↑↑请在这里配置您的基本信息↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑

    /** 
     * 写日志，方便测试（看网站需求，也可以改成把记录存入数据库）
     * @param sWord 要写入日志里的文本内容
     */
    public static void logResult(String sWord) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(log_path + "alipay_log_" + System.currentTimeMillis()+".txt");
            writer.write(sWord);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

