package cn.fy.fy.service.impl;

import cn.fy.fy.entity.Comment;
import cn.fy.fy.mapper.CommentMapper;
import cn.fy.fy.service.ICommentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CommentServiceImpl extends ServiceImpl<CommentMapper, Comment> implements ICommentService {
    @Resource
    private CommentMapper commentMapper;
    @Override
    public List<Comment> FindByTopic(Integer topicId) {
        return commentMapper.getByTopicId(topicId);
    }
}
