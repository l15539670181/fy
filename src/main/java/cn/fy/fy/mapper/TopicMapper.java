package cn.fy.fy.mapper;

import cn.fy.fy.entity.Topic;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

public interface TopicMapper extends BaseMapper<Topic> {
    Topic getById(Integer topicId);
    List<Topic> orderByComment();
    int updateCount(Integer topic);
}
