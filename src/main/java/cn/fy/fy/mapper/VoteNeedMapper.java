package cn.fy.fy.mapper;

import cn.fy.fy.entity.VoteNeed;
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
public interface VoteNeedMapper extends BaseMapper<VoteNeed> {
    //删除
    int delvoteid(@Param("voteId") int voteId);

}
