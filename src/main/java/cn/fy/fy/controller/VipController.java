package cn.fy.fy.controller;


import cn.fy.fy.service.impl.UserMessageServiceImpl;
import org.springframework.stereotype.Controller;
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
    public String cz(Integer id,Double moeny){
        Double m = 999.0;
        int i = userMessage.chongzhi(id,m);
        return "index";
    }
    //购买东西
    @RequestMapping("buy")
    public String buy(Integer id,Double money){
        Integer ii =1;
        Double aa=333.0;
        int i = userMessage.buy(ii,aa);
        return  "index";
    }
}
