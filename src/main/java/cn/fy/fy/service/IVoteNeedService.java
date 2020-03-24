package cn.fy.fy.service;

import cn.fy.fy.entity.VoteNeed;
import com.baomidou.mybatisplus.extension.service.IService;

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
}
