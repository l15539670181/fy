package cn.fy.fy.service;

import cn.fy.fy.entity.UserRecharge;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author liu
 * @since 2020-03-17
 */
public interface IUserRechargeService extends IService<UserRecharge> {
    //账单操作
    List<UserRecharge> get();
    //删除账单
    int deld(int userId);
}
