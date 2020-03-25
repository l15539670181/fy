package cn.fy.fy.service.impl;

import cn.fy.fy.entity.Gift;
import cn.fy.fy.mapper.GiftMapper;
import cn.fy.fy.service.IGiftService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author liu
 * @since 2020-03-17
 */
@Service
public class GiftServiceImpl extends ServiceImpl<GiftMapper, Gift> implements IGiftService {
    @Resource
    GiftMapper gift;
    //送礼物后总人气+，送礼物人气+
    @Override
    public int GiveGift(Double money, Integer VoteId) {
        return gift.GiveGift(money,VoteId);
    }
}
