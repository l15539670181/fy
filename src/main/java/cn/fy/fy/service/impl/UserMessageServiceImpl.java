package cn.fy.fy.service.impl;

import cn.fy.fy.entity.UserMessage;
import cn.fy.fy.mapper.UserMessageMapper;
import cn.fy.fy.service.IUserMessageService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 *
 * @author liu
 * @since 2020-03-17
 */
@Service("IUserMessageService")
public class UserMessageServiceImpl extends ServiceImpl<UserMessageMapper, UserMessage> implements IUserMessageService {
    @Resource
    private UserMessageMapper userMessageMapper;

    @Override
    public UserMessage finduser(UserMessage userMessage) {
        return userMessageMapper.getuser(userMessage);
    }
}
