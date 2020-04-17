package cn.fy.fy.mapper;

import cn.fy.fy.entity.Comment;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

public interface CommentMapper extends BaseMapper<Comment> {
    List<Comment> getByTopicId(Integer topicId);
}
