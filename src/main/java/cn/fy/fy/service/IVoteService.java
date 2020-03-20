package cn.fy.fy.service;

import cn.fy.fy.entity.Vote;
import cn.fy.fy.entity.VotePerson;
import com.baomidou.mybatisplus.extension.service.IService;

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
}
