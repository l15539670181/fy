package cn.fy.fy.service.impl;

import cn.fy.fy.entity.Fans;
import cn.fy.fy.entity.UserMessage;
import cn.fy.fy.mapper.FansMapper;
import cn.fy.fy.service.IFansService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class FansServiceImpl extends ServiceImpl<FansMapper, Fans> implements IFansService {
    @Resource
    private FansMapper fansMapper;
    @Override
    public List<Fans> findByUserId(Integer userId) {
        return fansMapper.getByUserId(userId);
    }

    @Override
    public int ins(Fans fans) {
        return fansMapper.add(fans);
    }

    @Override
    public int rem(Fans fans) {
        return fansMapper.del(fans);
    }
}
