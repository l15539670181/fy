package cn.fy.fy.service;

import cn.fy.fy.entity.Fans;
import cn.fy.fy.entity.UserMessage;
import com.baomidou.mybatisplus.extension.service.IService;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IFansService extends IService<Fans> {
    List<Fans> findByUserId(@Param("userId")Integer userId);
    int ins(@Param("fans") Fans fans);
    int rem(Fans fans);
}
