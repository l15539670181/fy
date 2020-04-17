package cn.fy.fy.service.impl;

import cn.fy.fy.entity.Topic;
import cn.fy.fy.mapper.TopicMapper;
import cn.fy.fy.service.ITopicService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TopicServiceImpl extends ServiceImpl<TopicMapper, Topic> implements ITopicService {
    @Resource
    private TopicMapper topicMapper;
    @Override
    public Topic findByid(Integer topicId) {
        return topicMapper.getById(topicId);
    }

    @Override
    public List<Topic> orderByComment() {
        return topicMapper.orderByComment();
    }

    @Override
    public int modifyCount(Integer topicId) {
        return topicMapper.updateCount(topicId);
    }
}
