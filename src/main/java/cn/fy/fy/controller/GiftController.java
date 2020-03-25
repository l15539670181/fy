package cn.fy.fy.controller;


import cn.fy.fy.entity.Gift;
import cn.fy.fy.service.IGiftService;
import cn.fy.fy.service.impl.GiftServiceImpl;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author liu
 * @since 2020-03-17
 */
@Controller
@RequestMapping("/gift")
public class GiftController {
    @Resource
    IGiftService giftService;
    @Resource
    GiftServiceImpl gifmpl;
    @RequestMapping("/gift")
    public String Gift(String giftId,String giftPrice){
       int i = gifmpl.GiveGift(Double.valueOf(giftPrice), Integer.valueOf(giftId));
        return "redirect:/";
    }
}
