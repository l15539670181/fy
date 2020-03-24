package cn.fy.fy.service.impl;

import cn.fy.fy.entity.Vote;
import cn.fy.fy.mapper.VoteMapper;
import cn.fy.fy.service.IVoteService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author liu
 * @since 2020-03-17
 */
@Service
public class VoteServiceImpl extends ServiceImpl<VoteMapper, Vote> implements IVoteService{
    @Resource
    private VoteMapper vote;
    //人气排行
    @Override
    public List<Vote> findPersonQi() {
        return vote.findPersonQi();
    }

    @Override
    public int findVote(Vote votes) {
        return vote.addVote(votes);
    }

    @Override
    public int findid(Integer userId) {
        return vote.selectid(userId);
    }
}
