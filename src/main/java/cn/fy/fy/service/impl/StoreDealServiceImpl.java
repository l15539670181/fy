package cn.fy.fy.service.impl;

import cn.fy.fy.entity.StoreDeal;
import cn.fy.fy.mapper.StoreDealMapper;
import cn.fy.fy.service.IStoreDealService;
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
public class StoreDealServiceImpl extends ServiceImpl<StoreDealMapper, StoreDeal> implements IStoreDealService {
    @Resource
    StoreDealMapper storeDealMapper;

    @Override
    public List<StoreDeal> FindDeals() {
        return storeDealMapper.FindDeals();
    }

    @Override
    public List<StoreDeal> FindDeal(Integer id) {
        return storeDealMapper.FindDeal(id);
    }

    @Override
    public int addDeal(StoreDeal storeDeal) {
        return storeDealMapper.addDeal(storeDeal);
    }
}
