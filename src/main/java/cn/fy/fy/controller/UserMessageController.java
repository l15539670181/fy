package cn.fy.fy.controller;


import cn.fy.fy.entity.UserMessage;
import cn.fy.fy.service.IUserMessageService;
import cn.fy.fy.service.impl.UserMessageServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author liu
 * @since 2020-03-17
 */
@Controller
@RequestMapping("/user-message")
public class UserMessageController {
    @Resource
    private UserMessageServiceImpl UserMessageService;

    @RequestMapping("/login.html")
    public String login(){
        return "login";
    }
    @RequestMapping("/login")
    public String lo(UserMessage userMessage,Model model,String userAdim,String userPwd){
        userMessage.setUserAdim(userAdim);
        userMessage.setUserPwd(userPwd);
        UserMessage i= UserMessageService.finduser(userMessage);
        if(i!=null){
            model.addAttribute("userMessage",userMessage);
            return "index";
        }else{
            return "login";
        }
    }

    @RequestMapping("/index")
    public String index(Model model){
        return "index";
    }
}
