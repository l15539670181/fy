package cn.fy.fy.controller;

import cn.fy.fy.entity.Comment;
import cn.fy.fy.entity.Topic;
import cn.fy.fy.service.ICommentService;
import cn.fy.fy.service.ITopicService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/topic")
public class TopicController {
    @Resource
    private ITopicService iTopicService;

    @Resource
    private ICommentService iCommentService;

    @RequestMapping("add.html")
    public String addhtml(){
        return "topic";
    }
    @RequestMapping("/add")
    public String add(Topic topic){
        iTopicService.save(topic);
        return "redirect:topicList";
    }
    @RequestMapping("topicList")
    public String list(Model model){
        List<Topic> topicList = iTopicService.list();
        List<Topic> topics = iTopicService.orderByComment();
        model.addAttribute("topics",topics);
        model.addAttribute("topicList",topicList);
        return "topicList";
    }
    @RequestMapping("topicById")
    public String topicById(Integer id,Model model){
        iTopicService.modifyCount(id);
        Topic topic = iTopicService.findByid(id);
        List<Comment> commentList = iCommentService.FindByTopic(id);
        model.addAttribute("commentList",commentList);
        model.addAttribute("topic",topic);
        return "topicById";
    }

}
