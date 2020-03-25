package cn.fy.fy.mapper;

import cn.fy.fy.entity.VoteNeed;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
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
public interface VoteNeedMapper extends BaseMapper<VoteNeed> {
    //删除
    int delvoteid(@Param("voteId") int voteId);
    //主页人气排行榜跳转
    List<VoteNeed> voteneed(@Param("id") Integer id);
    //投票后人气+1
    int addPerson(@Param("id") Integer id);
}
