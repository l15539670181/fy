package cn.fy.fy.controller;


import cn.fy.fy.entity.Store;
import cn.fy.fy.entity.StoreDeal;
import cn.fy.fy.service.IStoreService;
import cn.fy.fy.service.impl.StoreDealServiceImpl;
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
@RequestMapping("/Story")
public class StoreController {
    @Resource
    IStoreService Storys;
    @Resource
    StoreDealServiceImpl DelStorys;
    //查看所有商品
    @RequestMapping("/story")
    public String Story(Model model){
        List<Store> ListStory = Storys.list();
        model.addAttribute("ListStory",ListStory);
        return "Story";
    }
    //查看所有订单信息
    @RequestMapping("/storyDD")
    public String storyDD(Model model){
        List<StoreDeal> StoryDD = DelStorys.FindDeals();
        model.addAttribute("StoryDD",StoryDD);
        return "dingdan";
    }
    //查看指定订单（用户查看自己）
    @RequestMapping("/StoryMine")
    public String StoryMine(Model model,Integer id){
        List<StoreDeal> StoryMin = DelStorys.FindDeal(id);
        model.addAttribute("StoryMin",StoryMin);
        return "redirect:/";
    }
    //添加商品
    @RequestMapping("/tjwp")
    public String tjwp(Store sto){
        sto.setStoreExit(1);
        boolean bool = Storys.save(sto);
        return "Story";
    }
}
