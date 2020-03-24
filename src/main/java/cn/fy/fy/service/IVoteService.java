package cn.fy.fy.service;

import cn.fy.fy.entity.Vote;
import cn.fy.fy.entity.VotePerson;
import com.baomidou.mybatisplus.extension.service.IService;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author liu
 * @since 2020-03-17
 */
public interface IVoteService extends IService<Vote> {
    //人气排行
    List<Vote> findPersonQi();

    //发起投票
    int findVote(Vote vote);

    int findid(Integer userId);
    //删除1
    int chu(int voteId);
}
