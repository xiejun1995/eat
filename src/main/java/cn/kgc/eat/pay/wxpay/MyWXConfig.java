package cn.kgc.eat.pay.wxpay;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

/**
 * 微信支付配置类
 * 配置AppID、MchID、Key、商户证书内容、连接超时时间、读数据超时时间
 * WXPayDomain, 用于多域名容灾自动切换、是否自动上报、进行健康上报的线程的数量
 * 健康上报缓存消息的最大数量、批量上报，一次最多上报多个数据
 * @author 谢军军
 * @Email 18045972801@163.com
 * @date 2020/2/27 18:28
 */
public class MyWXConfig extends WXPayConfig {
    private byte[] certData;
    public MyWXConfig() throws Exception {
        String certPath = "src/main/resources/wxcertpath/apiclient_cert.p12";
        File file = new File(certPath);
        InputStream certStream = new FileInputStream(file);
        this.certData = new byte[(int) file.length()];
        certStream.read(this.certData);
        certStream.close();
    }
    @Override
    String getAppID() {
        return "wxab8acb865bb1637e";
    }

    @Override
    String getMchID() {
        return "11473623";
    }

    @Override
    String getKey() {
        return "2ab9071b06b9f739b950ddb41db2690d";
    }

    @Override
    InputStream getCertStream() {
        ByteArrayInputStream certBis = new ByteArrayInputStream(this.certData);
        return certBis;
    }

    @Override
    IWXPayDomain getWXPayDomain() {
        return null;
    }
}
