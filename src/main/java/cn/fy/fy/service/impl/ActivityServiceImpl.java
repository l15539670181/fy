package cn.fy.fy.service.impl;

import cn.fy.fy.entity.Activity;
import cn.fy.fy.mapper.ActivityMapper;
import cn.fy.fy.service.IActivityService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author liu
 * @since 2020-03-17
 */
@Service
public class ActivityServiceImpl extends ServiceImpl<ActivityMapper, Activity> implements IActivityService {

    @Resource
    private ActivityMapper activityMapper;
    @Override
    public int findActivity(Integer activityId) {
        return activityMapper.deleteActicity(activityId);
    }
}
