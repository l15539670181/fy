package cn.fy.fy.controller;


import cn.fy.fy.service.IVoteNeedService;
import cn.fy.fy.service.IVoteService;
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
@RestController
@RequestMapping("/vote-need")
public class VoteNeedController {
    @Resource
    private IVoteNeedService iVoteNeedService;
    private IVoteService iVoteService;
    @RequestMapping("del")
    public String del(int id ){
        int i=iVoteNeedService.delvoteid(id);
        if(i>0){
            int a=iVoteService.chu(id);
            return "redirect:/vote/list/";
        }
        return "redirect:/vote/list/";
    }
}
