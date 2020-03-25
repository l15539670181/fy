package cn.fy.fy.mapper;

import cn.fy.fy.entity.Gift;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author liu
 * @since 2020-03-17
 */
public interface GiftMapper extends BaseMapper<Gift> {
    //送礼物后总人气+，送礼物人气+
    int GiveGift(@Param("money") Double money,@Param("VoteId") Integer VoteId);
}
