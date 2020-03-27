package cn.fy.fy.controller;

import cn.fy.fy.entity.Concern;
import cn.fy.fy.entity.Fans;
import cn.fy.fy.entity.UserMessage;
import cn.fy.fy.service.IConcernService;
import cn.fy.fy.service.IFansService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/concern")
public class ConcernController {
    @Resource
    private IConcernService iConcernService;
    @Resource
    private IFansService iFansService;
    @RequestMapping("add")
    @ResponseBody
    public String add(String name, Integer id, HttpSession session){
        Concern concern = new Concern();
        UserMessage user = (UserMessage) session.getAttribute("user");
        concern.setUserId(user.getUserId());
        concern.setConcernId(id);
        concern.setConcernName(name);
        Fans fans = new Fans();
        fans.setUserId(id);
        fans.setFansId(user.getUserId());
        fans.setFansName(user.getUserName());
        if (iConcernService.ins(concern)>0) {
            iFansService.ins(fans);
            return "1";
        }
        return "0";
    }
    @RequestMapping("del")
    @ResponseBody
    public String del(Integer id,HttpSession session){
        Concern concern = new Concern();
        UserMessage user = (UserMessage) session.getAttribute("user");
        concern.setUserId(user.getUserId());
        concern.setConcernId(id);
        Fans fans = new Fans();
        fans.setFansId(user.getUserId());
        fans.setUserId(id);
        if(iConcernService.rem(concern)>0) {
            iFansService.rem(fans);
            return "1";
        }
        return "0";
    }
}
