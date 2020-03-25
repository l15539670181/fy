package cn.fy.fy.mapper;

import cn.fy.fy.entity.Vote;
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
public interface VoteMapper extends BaseMapper<Vote> {
    //人气排行
    List<Vote> findPersonQi();
    //发起投票
    int addVote(Vote vote);
    int selectid(@Param("userId") Integer userId);
    //删除1
    int shan(@Param("voteId") int voteId);
    //主页面的分类点击跳转
    List<Vote> findFenLei(@Param("id")Integer id);
}
