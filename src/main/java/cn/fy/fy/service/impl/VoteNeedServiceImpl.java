package cn.fy.fy.service.impl;

import cn.fy.fy.entity.VoteNeed;
import cn.fy.fy.mapper.VoteNeedMapper;
import cn.fy.fy.service.IVoteNeedService;
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
public class VoteNeedServiceImpl extends ServiceImpl<VoteNeedMapper, VoteNeed> implements IVoteNeedService {
    @Resource
    private  VoteNeedMapper voteNeedMapper;
    @Override
    //删除
    public int delvoteid(int voteId) {
        return voteNeedMapper.delvoteid(voteId);
    }
}
