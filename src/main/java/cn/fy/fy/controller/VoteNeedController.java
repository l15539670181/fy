package cn.fy.fy.controller;


import cn.fy.fy.entity.Vote;
import cn.fy.fy.entity.VoteNeed;
import cn.fy.fy.service.IVoteNeedService;
import cn.fy.fy.service.IVoteService;
import cn.fy.fy.service.impl.VoteNeedServiceImpl;
import cn.fy.fy.service.impl.VoteServiceImpl;
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
@RequestMapping("/vote-need")
public class VoteNeedController {
    @Resource
    private IVoteNeedService iVoteNeedService;
    @Resource
    private IVoteService iVoteService;
    @Resource
    private VoteNeedServiceImpl vim;
    @RequestMapping("del")
    public String del(int id ){
        int i=iVoteNeedService.delvoteid(id);
        if(i>0){
            int a=iVoteService.chu(id);
            return "redirect:/vote/list/";
        }
        return "redirect:/vote/list/";
    }
    //主页人气排行跳转
    @RequestMapping("/rq")
    public String Persons(Model model,Integer id){
        List<VoteNeed> voteNeeds = vim.voteneed(id);
        model.addAttribute("voteNeeds",voteNeeds);
        return "renqi";
    }
}
