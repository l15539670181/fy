package cn.fy.fy.service;

import cn.fy.fy.entity.VoteNeed;
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
public interface IVoteNeedService extends IService<VoteNeed> {
    //删除
    int delvoteid(int voteId);
    //主页人气排行榜跳转
    List<VoteNeed> voteneed(Integer id);
    //投票后人气+1
    int addPerson(Integer id);
}
