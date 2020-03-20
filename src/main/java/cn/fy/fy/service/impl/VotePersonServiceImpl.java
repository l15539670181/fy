package cn.fy.fy.service.impl;

import cn.fy.fy.entity.VotePerson;
import cn.fy.fy.mapper.VotePersonMapper;
import cn.fy.fy.service.IVotePersonService;
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
public class VotePersonServiceImpl extends ServiceImpl<VotePersonMapper, VotePerson> implements IVotePersonService {
}
