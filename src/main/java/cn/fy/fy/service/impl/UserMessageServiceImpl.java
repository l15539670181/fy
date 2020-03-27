package cn.fy.fy.service.impl;

import cn.fy.fy.entity.UserMessage;
import cn.fy.fy.mapper.UserMessageMapper;
import cn.fy.fy.service.IUserMessageService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.apache.catalina.User;
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

    //为用户充值
    @Override
    public int chongzhi(Integer id,Double money) {
        return userMessageMapper.chongzhi(id,money);
    }
    //购买东西
    @Override
    public int buy(Integer id,Double money) {
        return userMessageMapper.buy(id,money);
    }


    @Override
    public List<UserMessage> findByName(UserMessage userMessage){
        if(userMessage.getUserName()==null){
            userMessage.setUserName("");
        }
        return userMessageMapper.getByName(userMessage);
    }
    //删除账单
    @Override
    public int delc(int userId) { return userMessageMapper.dela(userId); }
    //修改账单
    @Override
    public int updatemoney(UserMessage userMessage) {
        return userMessageMapper.updmoney(userMessage);
    }

    @Override
    public UserMessage ectupd(Integer userId) {
        return userMessageMapper.selupd(userId);
    }

}
