package cn.fy.fy.service.impl;

import cn.fy.fy.entity.Concern;
import cn.fy.fy.entity.UserMessage;
import cn.fy.fy.mapper.ConcernMapper;
import cn.fy.fy.service.IConcernService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ConcernServiceImpl extends ServiceImpl<ConcernMapper, Concern> implements IConcernService {
    @Resource
    private ConcernMapper concernMapper;
    @Override
    public List<Concern> findByUserId(Integer userId) {
        return concernMapper.getByUserId(userId);
    }

    @Override
    public int ins(Concern concern) {
        return concernMapper.add(concern);
    }

    @Override
    public int rem(Concern concern) {
        return concernMapper.del(concern);
    }

    @Override
    public List<Concern> findById(Integer concernId) {
        return concernMapper.getByid(concernId);
    }
}
