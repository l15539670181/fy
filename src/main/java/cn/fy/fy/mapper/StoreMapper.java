package cn.fy.fy.mapper;

import cn.fy.fy.entity.Store;
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
public interface StoreMapper extends BaseMapper<Store> {
    //主页面下边商城需要获取前n个物品1
    List<Store> AllWuPin(@Param("id") Integer id);
    //主页面下边商城需要获取前n个物品2
    List<Store> AllWuPin2(@Param("id") Integer id);
    //主页面下边商城需要获取前n个物品3
    List<Store> AllWuPin3(@Param("id") Integer id);
    //获取指定物品信息
    List<Store> WuPin(@Param("id") Integer id);
    //买完库存-1
    int kucun(@Param("id") Integer id);
}
