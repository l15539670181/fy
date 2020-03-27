package cn.fy.fy.service;

import cn.fy.fy.entity.Concern;
import cn.fy.fy.entity.UserMessage;
import com.baomidou.mybatisplus.extension.service.IService;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IConcernService extends IService<Concern> {
    List<Concern> findByUserId(Integer userId);
    int ins(Concern concern);
    int rem(Concern concern);
    List<Concern> findById(Integer concernId);
}
