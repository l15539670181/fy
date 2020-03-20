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
}
