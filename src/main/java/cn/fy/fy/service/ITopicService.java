package cn.fy.fy.service;

import cn.fy.fy.entity.Topic;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

public interface ITopicService extends IService<Topic> {
    Topic findByid(Integer topicId);
    List<Topic> orderByComment();
    int modifyCount(Integer topicId);
}
