package cn.fy.fy.service;

import cn.fy.fy.entity.Gift;
import com.baomidou.mybatisplus.extension.service.IService;
import org.apache.ibatis.annotations.Param;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author liu
 * @since 2020-03-17
 */
public interface IGiftService extends IService<Gift> {
    //送礼物后总人气+，送礼物人气+
    int GiveGift(Double money, Integer VoteId);
}
