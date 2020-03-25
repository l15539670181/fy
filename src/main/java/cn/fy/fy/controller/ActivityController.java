package cn.fy.fy.controller;


import cn.fy.fy.entity.Activity;
import cn.fy.fy.service.IActivityService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

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
@RequestMapping("/activity")
public class ActivityController {
    @Resource
    private IActivityService iActivityService;

    @Resource
    private IActivityService  apl1;
    @RequestMapping("/huo")
    public String huo(){
        return "huo";
    }

    @RequestMapping("/huo.html")
    public String huo(Activity activity){
        boolean i=iActivityService.save(activity);
        if(i){
            return "redirect:/";
        }else {
            return "huo";
        }
    }

    @RequestMapping("/delhuo")
    public String delhuo( Model model){
        List<Activity> listActivity = apl1.list();
        model.addAttribute("listActivity",listActivity);
        return "delhuo";
    }

    @RequestMapping("/delhuo.html")
    public String delete(Integer activityId){
        int i=iActivityService.findActivity(activityId);
        if(i>0){
            return "redirect:/";
        }else {
            return "delhuo";
        }
    }


}
