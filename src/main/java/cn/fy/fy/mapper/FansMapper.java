package cn.fy.fy.mapper;

import cn.fy.fy.entity.Fans;
import cn.fy.fy.entity.UserMessage;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface FansMapper extends BaseMapper<Fans> {
    List<Fans> getByUserId(@Param("userId")Integer userId);
    int add(Fans fans);
    int del(Fans fans);
}
