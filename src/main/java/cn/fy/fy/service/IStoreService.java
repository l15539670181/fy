package cn.fy.fy.service;

import cn.fy.fy.entity.Store;
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
public interface IStoreService extends IService<Store> {
    //主页面下边商城需要获取前n个物品1
    List<Store> AllWuPin(Integer id);
    //主页面下边商城需要获取前n个物品2
    List<Store> AllWuPin2(Integer id);
    //主页面下边商城需要获取前n个物品3
    List<Store> AllWuPin3(Integer id);
    //获取指定物品信息
    List<Store> WuPin(Integer id);
    //买完库存-1
    int kucun(Integer id);
}
