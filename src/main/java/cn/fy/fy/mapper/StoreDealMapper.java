package cn.fy.fy.mapper;

import cn.fy.fy.entity.StoreDeal;
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
public interface StoreDealMapper extends BaseMapper<StoreDeal> {
    //查看订单
    List<StoreDeal> FindDeals();
    //查看指定订单（用户看自己）
    List<StoreDeal> FindDeal(@Param("id") Integer id);
    //添加订单
    int addDeal(StoreDeal storeDeal);
}
