package cn.fy.fy.service.impl;

import cn.fy.fy.entity.Anime;
import cn.fy.fy.mapper.AnimeMapper;
import cn.fy.fy.service.IAnimeService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
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
public class AnimeServiceImpl extends ServiceImpl<AnimeMapper, Anime> implements IAnimeService {

    @Resource
    private AnimeMapper animeMapper;
    @Override
    public List<Anime> findAnime() {
        return animeMapper.selectAnime();
    }
}
