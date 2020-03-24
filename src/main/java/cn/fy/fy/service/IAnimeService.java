package cn.fy.fy.service;

import cn.fy.fy.entity.Anime;
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
public interface IAnimeService extends IService<Anime> {

    List<Anime> findAnime();
}
