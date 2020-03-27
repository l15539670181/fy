package cn.fy.fy.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;

/**
 * @author reading
 * @Description TODO
 * @Date 2020/3/12 14:29
 */
@Configuration
@EnableWebSocketMessageBroker//表示开启使用STOMP协议来传输基于代理的消息，Broker就是代理的意思。
public class WebsocketConfig implements WebSocketMessageBrokerConfigurer {
    /**
     * 注册stomp的端点
     * @param registry
     */
    @Override
    public void registerStompEndpoints(StompEndpointRegistry registry) {
        //允许使用socketJs方式访问，访问点为chat,允许跨域
        //在网页上我们可以通过这个链接
        //http://localhost:8080/chat
        //来和服务器的websocket连接
        registry.addEndpoint("/chat").withSockJS();//与socket建立连接
    }
    /**
     * 配置信息代理
     * @param registry
     */
    @Override
    public void configureMessageBroker(MessageBrokerRegistry registry) {
        //订阅Broker的名称（群聊）
        registry.enableSimpleBroker("/yad");
        //全局使用的消息前缀（客户端订阅路径上会体现出来）
        registry.setApplicationDestinationPrefixes("/app");
    }
}
