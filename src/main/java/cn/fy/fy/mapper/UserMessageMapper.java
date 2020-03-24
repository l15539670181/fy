package cn.fy.fy.mapper;

import cn.fy.fy.entity.UserMessage;
import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.catalina.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author liu
 * @since 2020-03-17
 */
public interface UserMessageMapper extends BaseMapper<UserMessage> {
    //查询用户 登录功能
    UserMessage getuser(UserMessage userMessage);
    //为用户充值
    int chongzhi(@Param("id") Integer id, @Param("money") Double money);
    //购买东西
    int buy(@Param("id") Integer id, @Param("money") Double money);
}
