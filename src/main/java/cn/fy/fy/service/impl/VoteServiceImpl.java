package cn.fy.fy.service.impl;

import cn.fy.fy.entity.Vote;
import cn.fy.fy.mapper.VoteMapper;
import cn.fy.fy.service.IVoteService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author liu
 * @since 2020-03-17
 */
@Service
public class VoteServiceImpl extends ServiceImpl<VoteMapper, Vote> implements IVoteService {

}
