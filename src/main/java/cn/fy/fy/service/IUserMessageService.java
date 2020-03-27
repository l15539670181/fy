package cn.fy.fy.service;

import cn.fy.fy.entity.UserMessage;
import com.baomidou.mybatisplus.extension.service.IService;
import org.apache.catalina.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author liu
 * @since 2020-03-17
 */
public interface IUserMessageService extends IService<UserMessage> {
    UserMessage finduser(UserMessage userMessage);
    //为用户充值
    int chongzhi(Integer id, Double money);
    //购买东西
    int buy(Integer id, Double money);

    List<UserMessage> findByName(UserMessage userMessage);

    //删除账单
    int delc(int userId);
    //修改账单
    int updatemoney(UserMessage userMessage);
    //查询修改账单
    UserMessage ectupd(Integer userId);
}
