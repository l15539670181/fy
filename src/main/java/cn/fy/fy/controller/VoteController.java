package cn.fy.fy.controller;


import cn.fy.fy.entity.Anime;
import cn.fy.fy.entity.UserMessage;
import cn.fy.fy.entity.Vote;
import cn.fy.fy.entity.VoteNeed;
import cn.fy.fy.service.IAnimeService;
import cn.fy.fy.service.IVoteNeedService;
import cn.fy.fy.service.IVoteService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
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
@RequestMapping("/vote")
public class VoteController {
    @Resource
    private IVoteService iVoteService;

    @Resource
    private IAnimeService iAnimeService;

    @Resource
    private IVoteNeedService iVoteNeedService;

    @RequestMapping("/vote")
    public String Vote(Model model){
        List<Anime> animeList = iAnimeService.findAnime();
        model.addAttribute("animeList",animeList);
        return "vote1";
    }
    @RequestMapping("list")
    public String show(Model model){
        List<Vote> list=iVoteService.findPersonQi();
        model.addAttribute("list",list);
        return "vote";
    }

    @RequestMapping("/vote.html")
    public String Vote(Vote vote,HttpSession session,String [] voteNeedName,int voteConditionVotes){
        UserMessage userMessage =(UserMessage) session.getAttribute("user");
        vote.setUserId(userMessage.getUserId());
        int i=iVoteService.findVote(vote);
        int id=iVoteService.findid(vote.getUserId());
        if(i>0){
            VoteNeed voteNeed=new VoteNeed();
            voteNeed.setVoteId(id);
            for (int it=0;it<voteNeedName.length;it++){
                voteNeed.setVoteNeedName(voteNeedName[it]);
                voteNeed.setVoteConditionVotes(voteConditionVotes);
                iVoteNeedService.save(voteNeed);
            }
            return "redirect:/anime-type/list/";
        }else {
            return "vote1";
        }

    }


}
