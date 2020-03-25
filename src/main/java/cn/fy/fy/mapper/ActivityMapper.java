package cn.fy.fy.mapper;

import cn.fy.fy.entity.Activity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author liu
 * @since 2020-03-17
 */
public interface ActivityMapper extends BaseMapper<Activity> {
     int deleteActicity(@Param("activityId") Integer activityId);
}
