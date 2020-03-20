package cn.fy.fy.controller;


import cn.fy.fy.entity.Activity;
import cn.fy.fy.entity.AnimeType;
import cn.fy.fy.entity.Vote;
import cn.fy.fy.entity.VotePerson;
import cn.fy.fy.service.IActivityService;
import cn.fy.fy.service.IAnimeTypeService;
import cn.fy.fy.service.IVotePersonService;
import cn.fy.fy.service.impl.VotePersonServiceImpl;
import cn.fy.fy.service.impl.VoteServiceImpl;
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
//   分类+人气排行榜+活动榜
    @RequestMapping("/")
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
}
