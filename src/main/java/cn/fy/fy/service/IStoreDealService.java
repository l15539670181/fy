package cn.fy.fy.service;

import cn.fy.fy.entity.StoreDeal;
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
public interface IStoreDealService extends IService<StoreDeal> {
    //查看订单
    List<StoreDeal> FindDeals();
    //查看指定订单（用户看自己）
    List<StoreDeal> FindDeal(Integer id);
}
