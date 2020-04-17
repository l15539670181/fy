package cn.fy.fy.service;

import cn.fy.fy.entity.Comment;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

public interface ICommentService extends IService<Comment> {
    List<Comment> FindByTopic(Integer topicId);
}
