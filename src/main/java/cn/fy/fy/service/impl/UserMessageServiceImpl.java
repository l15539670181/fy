package cn.fy.fy.service.impl;

import cn.fy.fy.config.AlipayConfig;
import cn.fy.fy.entity.StoreDeal;
import cn.fy.fy.entity.UserMessage;
import cn.fy.fy.mapper.StoreDealMapper;
import cn.fy.fy.mapper.StoreMapper;
import cn.fy.fy.mapper.UserMessageMapper;
import cn.fy.fy.service.IUserMessageService;
import cn.fy.fy.util.RedisTemplateUtil;
import com.alipay.api.AlipayApiException;
import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.request.AlipayTradePagePayRequest;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.apache.catalina.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 *
 * @author liu
 * @since 2020-03-17
 */
@Service("IUserMessageService")
public class UserMessageServiceImpl extends ServiceImpl<UserMessageMapper, UserMessage> implements IUserMessageService {
    @Resource
    private UserMessageMapper userMessageMapper;

    @Resource
    private StoreDealMapper storeDealMapper;
    @Resource
    private StoreMapper storeMapper;
    @Resource
    private RedisTemplateUtil redisTemplateUtil;

    @Override
    public UserMessage finduser(UserMessage userMessage) {
        UserMessage user = (UserMessage) redisTemplateUtil.get(userMessage.getUserAdim());
        if(null!=user){
            return user;
        }else {
            UserMessage getuser = userMessageMapper.getuser(userMessage);
            if(null!=getuser){
                redisTemplateUtil.set(getuser.getUserAdim(),getuser);
                return getuser;
            }else {
                return null;
            }
        }
    }

    //为用户充值
    @Override
    public int chongzhi(Integer id, Double money,HttpServletRequest request, HttpServletResponse response) throws IOException {

        //获得初始化的AlipayClient
        AlipayClient alipayClient = new DefaultAlipayClient(AlipayConfig.gatewayUrl, AlipayConfig.APP_ID, AlipayConfig.APP_PRIVATE_KEY, "json", AlipayConfig.CHARSET, AlipayConfig.ALIPAY_PUBLIC_KEY, AlipayConfig.sign_type);

        //设置请求参数
        AlipayTradePagePayRequest alipayRequest = new AlipayTradePagePayRequest();
        alipayRequest.setReturnUrl("http://localhost:8080/fy/user-message/admin");
        alipayRequest.setNotifyUrl(AlipayConfig.notify_url);
        int num = (int) ((Math.random() * 9 + 1) * 10000000);
        //商户订单号，商户网站订单系统中唯一订单号，必填
        String out_trade_no = String.valueOf(num);
        //付款金额，必填
        String total_amount = String.valueOf(money);
        //订单名称，必填
        String subject = "余额充值";
        //商品描述，可空
        String body = "";
        alipayRequest.setBizContent("{\"out_trade_no\":\"" + out_trade_no + "\","
                + "\"total_amount\":\"" + total_amount + "\","
                + "\"subject\":\"" + subject + "\","
                + "\"body\":\"" + body + "\","
                + "\"product_code\":\"FAST_INSTANT_TRADE_PAY\"}");

        //若想给BizContent增加其他可选请求参数，以增加自定义超时时间参数timeout_express来举例说明
        //alipayRequest.setBizContent("{\"out_trade_no\":\""+ out_trade_no +"\","
        //		+ "\"total_amount\":\""+ total_amount +"\","
        //		+ "\"subject\":\""+ subject +"\","
        //		+ "\"body\":\""+ body +"\","
        //		+ "\"timeout_express\":\"10m\","
        //		+ "\"product_code\":\"FAST_INSTANT_TRADE_PAY\"}");
        //请求参数可查阅【电脑网站支付的API文档-alipay.trade.page.pay-请求参数】章节

        //请求
        String form = "";
        try {
            form = alipayClient.pageExecute(alipayRequest).getBody(); //调用SDK生成表单
        } catch (AlipayApiException e) {
            e.printStackTrace();
        }
        response.setContentType("text/html;charset=" + AlipayConfig.CHARSET);
        response.getWriter().write(form);//直接将完整的表单html输出到页面
        response.getWriter().flush();
        response.getWriter().close();
        return userMessageMapper.chongzhi(id,money);
    }
    //购买东西
    @Override
    public int buy(Integer id,Double money,HttpServletRequest request, HttpServletResponse response,Integer storeId) throws IOException {
        //获得初始化的AlipayClient
        AlipayClient alipayClient = new DefaultAlipayClient(AlipayConfig.gatewayUrl, AlipayConfig.APP_ID, AlipayConfig.APP_PRIVATE_KEY, "json", AlipayConfig.CHARSET, AlipayConfig.ALIPAY_PUBLIC_KEY, AlipayConfig.sign_type);

        //设置请求参数
        AlipayTradePagePayRequest alipayRequest = new AlipayTradePagePayRequest();
        alipayRequest.setReturnUrl("http://localhost:8080/fy/user-message/admin");
        alipayRequest.setNotifyUrl(AlipayConfig.notify_url);
        int num = (int) ((Math.random() * 9 + 1) * 10000000);
        //商户订单号，商户网站订单系统中唯一订单号，必填
        String out_trade_no = String.valueOf(num);
        //付款金额，必填
        String total_amount = String.valueOf(money);
        //订单名称，必填
        String subject = "购买物品";
        //商品描述，可空
        String body = "";
        alipayRequest.setBizContent("{\"out_trade_no\":\"" + out_trade_no + "\","
                + "\"total_amount\":\"" + total_amount + "\","
                + "\"subject\":\"" + subject + "\","
                + "\"body\":\"" + body + "\","
                + "\"product_code\":\"FAST_INSTANT_TRADE_PAY\"}");

        //若想给BizContent增加其他可选请求参数，以增加自定义超时时间参数timeout_express来举例说明
        //alipayRequest.setBizContent("{\"out_trade_no\":\""+ out_trade_no +"\","
        //		+ "\"total_amount\":\""+ total_amount +"\","
        //		+ "\"subject\":\""+ subject +"\","
        //		+ "\"body\":\""+ body +"\","
        //		+ "\"timeout_express\":\"10m\","
        //		+ "\"product_code\":\"FAST_INSTANT_TRADE_PAY\"}");
        //请求参数可查阅【电脑网站支付的API文档-alipay.trade.page.pay-请求参数】章节

        //请求
        String form = "";
        try {
            form = alipayClient.pageExecute(alipayRequest).getBody(); //调用SDK生成表单
        } catch (AlipayApiException e) {
            e.printStackTrace();
        }
        response.setContentType("text/html;charset=" + AlipayConfig.CHARSET);
        response.getWriter().write(form);//直接将完整的表单html输出到页面
        response.getWriter().flush();
        response.getWriter().close();
        StoreDeal storeDeal = new StoreDeal();
        storeDeal.setStoreDeal(String.valueOf(num));
        storeDeal.setStoreDealMoney(money);
        storeDeal.setStoreId(storeId);
        storeDeal.setUserId(id);
        storeDealMapper.addDeal(storeDeal);
        storeMapper.kucun(storeId);
        return userMessageMapper.buy(id,money);
    }


    @Override
    public List<UserMessage> findByName(UserMessage userMessage){
        if(userMessage.getUserName()==null){
            userMessage.setUserName("");
        }
        return userMessageMapper.getByName(userMessage);
    }
    //删除账单
    @Override
    public int delc(int userId) { return userMessageMapper.dela(userId); }
    //修改账单
    @Override
    public int updatemoney(UserMessage userMessage) {
        return userMessageMapper.updmoney(userMessage);
    }

    @Override
    public UserMessage ectupd(Integer userId) {
        return userMessageMapper.selupd(userId);
    }

}
