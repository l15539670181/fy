package cn.fy.fy.mapper;

import cn.fy.fy.entity.UserMessage;
import cn.fy.fy.entity.UserRecharge;
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
public interface UserRechargeMapper extends BaseMapper<UserRecharge> {
    //查询账单
    List<UserRecharge> list();
    //删除账单
    int delb(@Param("userId") int userId);
}
