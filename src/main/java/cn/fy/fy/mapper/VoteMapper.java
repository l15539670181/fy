package cn.fy.fy.mapper;

import cn.fy.fy.entity.Vote;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author liu
 * @since 2020-03-17
 */
public interface VoteMapper extends BaseMapper<Vote> {
    //人气排行
    List<Vote> findPersonQi();
}
