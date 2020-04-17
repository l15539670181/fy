package cn.fy.fy.service.impl;

import cn.fy.fy.entity.Store;
import cn.fy.fy.mapper.StoreMapper;
import cn.fy.fy.service.IStoreService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author liu
 * @since 2020-03-17
 */
@Service
public class StoreServiceImpl extends ServiceImpl<StoreMapper, Store> implements IStoreService {
    @Resource
    private StoreMapper storeMapper;
    //主页面下边商城需要获取前n个物品
    @Override
    public List<Store> AllWuPin(Integer id) {
        return storeMapper.AllWuPin(id);
    }
    //2
    @Override
    public List<Store> AllWuPin2(Integer id) {
        return storeMapper.AllWuPin(id);
    }
    //3
    @Override
    public List<Store> AllWuPin3(Integer id) {
        return storeMapper.AllWuPin(id);
    }

    //指定物品信息
    @Override
    public List<Store> WuPin(Integer id) {
        return storeMapper.WuPin(id);
    }
    //买完库存-1
    @Override
    public int kucun(Integer id) {
        return storeMapper.kucun(id);
    }
}
