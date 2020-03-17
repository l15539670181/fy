package cn.fy.fy.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author liu
 * @since 2020-03-17
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("user_recharge")
public class UserRecharge implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "user_recharge_id", type = IdType.AUTO)
    private Integer userRechargeId;

    /**
     * 【外键用户id】
     */
    private Integer userId;

    private Double userRechargeMoney;

    private Double userRechargeActualamount;


}
