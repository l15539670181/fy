package cn.fy.fy.mapper;

import cn.fy.fy.entity.Anime;
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
public interface AnimeMapper extends BaseMapper<Anime> {
     List<Anime> selectAnime();
}
