package cn.fy.fy.controller;

import cn.fy.fy.entity.Message;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class GreetingController {
    @Resource
    private SimpMessagingTemplate simpMessagingTemplate;
    @MessageMapping("/hello")
    public void greeting(Message message) {
        simpMessagingTemplate.convertAndSend("/yad", message);
    }
}
