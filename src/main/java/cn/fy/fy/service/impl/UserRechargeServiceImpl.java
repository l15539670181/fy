package cn.fy.fy.service.impl;

import cn.fy.fy.entity.UserRecharge;
import cn.fy.fy.mapper.UserRechargeMapper;
import cn.fy.fy.service.IUserRechargeService;
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
@Service()
public class UserRechargeServiceImpl extends ServiceImpl<UserRechargeMapper, UserRecharge> implements IUserRechargeService {
    @Resource
    private UserRechargeMapper userRechargeMapper;
    //查询账单
    @Override
    public List<UserRecharge> get() {
        return userRechargeMapper.list();
    }
    //删除账单
    @Override
    public int deld(int userId) {
        return userRechargeMapper.delb(userId);
    }
}
