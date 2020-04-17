package cn.fy.fy.config;

import java.io.FileWriter;
import java.io.IOException;

public class AlipayConfig {

    // 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号,开发时使用沙箱提供的APPID，生产环境改成自己的APPID
    public static String APP_ID = "2016102300743791";

    // 商户私钥，您的PKCS8格式RSA2私钥
    public static String APP_PRIVATE_KEY = "MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQCOZ2W5kU72qtZ/iNrDLhSEo4TooKlg3VWEV6XNXVY6Tojb4VOsdGuOBRVByLrPXH6w1MU1DloYBLMxB0W1H9SXsMAQc7L7ShP91TcqF3/ccd0cNPmGUk+eSiEtYmaY5c9EFnbDK+PD+PkNvCM7Fq9TJgV2k061eJmP0p7rkFjIAyekELqMk/Efp/kS88EfATjZGA7lcARG3KDRiksYwtRT33kGv/nEjXgLGJ6MNDzVNsSp5GxbtPH7LdWl6TelKWScClbhilTFEq8Tabtn1ru+xTLUEbiKsy8/MXwnjzPkjnzuamk+R2pW6h9qhHbxM27C3/ucOz+iUNJjGruVQit1AgMBAAECggEAKaJvam7ikFnodsczdqdNVm5cmIsImop7y0K49i8Y29lESE074orzO0WfLmmavK/FVrwOoHF+w9Dz9xyyM7+Hr4X80ZKSPMguyiMBiuvt9SzRQcL3RV9had0wkA1aA9AE5lpPBMcbQ5vSbUKZZlg+kGfoZv+wnnwRIaypzCOa4Xcf276oPq1i2HtW1i50diVNLhBvNk57j30jN3w2WB/rFeqV4Idlu69dSK6+L0l/rs3dtQJEy5oOq27a/4C9zWGohIdTVMYJe3WEs6dtcQ58gxdWFnKjue7Lff6GdTckEVO1Ok8Kln6ID8MUnnILxTfXiwhp/ephOaLZyfH5ePl2DQKBgQDyGXpVpw2lMHRxFpnUrXWRkzhtwVoMj3fkw6lKp/uU7hrBQdKCZAFp8yvN24QHOwX3O6in2lSsVI+epJu/0Ouh/Ji85cCCa6xsPb1NS5cIGz7gpGISwJRzNetLgh241uwYRFbFho5dMdHc1P8sDeb7FRcPTyR5/JRjTOD0K2mT/wKBgQCWlIi9Z72dh07LsI2saYF0fCK1bPU5EBWXUWWiJrRQI/IelwRxXSOMw3JJv7/yy8Aqtw/NB/VDsZR4JV2ybSwjngsCIInBOlKvkr/NMLs9B7eGd/u4RdTAfPLr6PxfUvOT0DDHtCCWa3nQK9twHrfEMNMu/gDb596Qc11dnNEwiwKBgQCThvMFPscR4nUSdLNI5mq+SvgX6br17Hci8Bg5ZiPonS+wlGuzCT3TUltfFmVeApmgDrq3jlQKr3zVL3m5aZYtH7/zXA3za6mmS/kPIQDn77JhMcqRosjTbAf1+1QhTtaP8xTtSRF3uOQpraHRNqeKWU+0BIY1z7SczjxGji3IAQKBgFPUSy/OwkQhoN9K4gRbFEPKG/SOvRJQfwSnvwH/tCBtcoxPHJ0T8geag1TFWFIN1mSxVy2YwZU3FmWwv7Hmj00g3hYIEUiudHvkIb1U5Ng8JJLK1ysmTSQAK6jkIyPaZVoj7BQxlnbHTKB02gxYPYwOdnNR2x6RvlkCsLa958OzAoGBALlnKutTmdNP4LW5LAc2c/dNdnspZK/yx52iGxX5+Gk/WSCIsYd1eO2Z8lJ9401nl39lvCRrDoArxXGa7Ln7HmSS19s3UOeGHQPMyMXJw+bGA1XGfqYd5oaqNDhhe9Kl2dWcPY8KswSZWZcXJabjoMyTvGQBNcAK71edzf0ChZqA";

    // 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
    public static String ALIPAY_PUBLIC_KEY = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAjrEVFMOSiNJXaRNKicQuQdsREraftDA9Tua3WNZwcpeXeh8Wrt+V9JilLqSa7N7sVqwpvv8zWChgXhX/A96hEg97Oxe6GKUmzaZRNh0cZZ88vpkn5tlgL4mH/dhSr3Ip00kvM4rHq9PwuT4k7z1DpZAf1eghK8Q5BgxL88d0X07m9X96Ijd0yMkXArzD7jg+noqfbztEKoH3kPMRJC2w4ByVdweWUT2PwrlATpZZtYLmtDvUKG/sOkNAIKEMg3Rut1oKWpjyYanzDgS7Cg3awr1KPTl9rHCazk15aNYowmYtVabKwbGVToCAGK+qQ1gT3ELhkGnf3+h53fukNqRH+wIDAQAB";

    // 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    public static String notify_url = "http://localhost:8080/alipay.trade.page.pay-JAVA-UTF-8/notify_url.jsp";

    // 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问(其实就是支付成功后返回的页面)
    public static String return_url = "http://localhost:8080/alipay.trade.page.pay-JAVA-UTF-8/return_url.jsp";

    // 签名方式
    public static String sign_type = "RSA2";

    // 字符编码格式
    public static String CHARSET = "utf-8";

    // 支付宝网关，这是沙箱的网关
    public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";

    // 支付宝网关
    public static String log_path = "D:\\";


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
