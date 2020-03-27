package cn.fy.fy.mapper;

import cn.fy.fy.entity.Concern;
import cn.fy.fy.entity.UserMessage;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ConcernMapper extends BaseMapper<Concern> {
    List<Concern> getByUserId(@Param("userId")Integer userId);
    int add(Concern concern);
    int del(Concern concern);
    List<Concern> getByid(@Param("concernId")Integer concernId);
}
