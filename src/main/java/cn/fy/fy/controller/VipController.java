package cn.fy.fy.controller;


import cn.fy.fy.entity.UserMessage;
import cn.fy.fy.service.impl.UserMessageServiceImpl;
import org.apache.ibatis.logging.LogFactory;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author liu
 * @since 2020-03-17
 */
@Controller
@RequestMapping("/Recharge")
public class VipController {
    @Resource
    UserMessageServiceImpl userMessage;
    @RequestMapping("/chongzhi")
    public String czzhuye(){
        return "chongzhi";
    }
    //充值
    @RequestMapping("cz")
    public String cz(HttpSession session, Double docVlGender, HttpServletRequest request, HttpServletResponse response) throws IOException {
        UserMessage user = (UserMessage) session.getAttribute("user");
        Integer id=user.getUserId();
        int i = userMessage.chongzhi(id,docVlGender,request,response);
        String trade_status = new String(request.getParameter("trade_status").getBytes("ISO-8859-1"),"UTF-8");
        System.out.println(trade_status);
        return "redirect:/";
    }
    //购买东西
    @RequestMapping("buy")
    public String buy(Integer id,Double money,HttpSession session,HttpServletRequest request, HttpServletResponse response,Integer storeId) throws IOException{
        int i = userMessage.buy(id,money,request,response,storeId);
        return  "buy";
    }
}
