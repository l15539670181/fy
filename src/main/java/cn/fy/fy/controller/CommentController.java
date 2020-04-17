package cn.fy.fy.controller;

import cn.fy.fy.entity.Comment;
import cn.fy.fy.entity.UserMessage;
import cn.fy.fy.service.ICommentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/comment")
public class CommentController  {
    @Resource
    private ICommentService iCommentService;
    @RequestMapping("add")
    @ResponseBody
    public String add(Integer topicId, String content, HttpSession session){
        UserMessage user = (UserMessage) session.getAttribute("user");
        Comment comment = new Comment();
        comment.setCommentContent(content);
        comment.setTopicId(topicId);
        comment.setUserId(user.getUserId());
        if(iCommentService.save(comment))
            return "1";
        return "0";
    }
}
