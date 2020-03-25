package cn.fy.fy.controller;


import cn.fy.fy.entity.*;
import cn.fy.fy.service.IActivityService;
import cn.fy.fy.service.IAnimeTypeService;
import cn.fy.fy.service.IGiftService;
import cn.fy.fy.service.IVotePersonService;
import cn.fy.fy.service.impl.AnimeTypeServiceImpl;
import cn.fy.fy.service.impl.VoteNeedServiceImpl;
import cn.fy.fy.service.impl.VotePersonServiceImpl;
import cn.fy.fy.service.impl.VoteServiceImpl;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
@RequestMapping("/anime-type")
public class AnimeTypeController {
    @Resource
    private IAnimeTypeService apl;
    @Resource
    private IActivityService  apl1;
    @Resource
    private VoteServiceImpl apl2;
    @Resource
    private VoteServiceImpl apl3;
    @Resource
    private VoteNeedServiceImpl vim;
    @Resource
    private IGiftService giftService;
//   分类+人气排行榜+活动榜
    @RequestMapping("/list")
    public String yemian(Model model)throws Exception{
        //分类
        List<AnimeType> listAnimeType = apl.list();
        model.addAttribute("listAnimeType",listAnimeType);
        //活动排行榜
        List<Activity> listActivity = apl1.list();
        model.addAttribute("listActivity",listActivity);
        //人气排行榜
        List<Vote> listVotePerson =apl2.findPersonQi();
        model.addAttribute("listVotePerson",listVotePerson);
        return "index";
    }
    //主页面的分类点击跳转
    @RequestMapping("/fenlei")
    public String fenlei(Integer id,Model model){
        List<Vote> findType = apl3.findFenLei(id);
        model.addAttribute("findType",findType);
        return "FenLei";
    }
    //主页面的分类点击跳转之后在跳转投票
    @RequestMapping("/fenleiTou")
    public String fenleiTou(Model model,Integer id){
        List<VoteNeed> voteNeeds = vim.voteneed(id);
        model.addAttribute("voteNeeds",voteNeeds);
        //获取礼物
        List<Gift> giveGift = giftService.list();
        model.addAttribute("giveGift",giveGift);
        return "renqi";
    }
}
