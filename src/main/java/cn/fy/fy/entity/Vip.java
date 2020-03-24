package cn.fy.fy.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

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
@TableName("vip")
public class Vip implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "vip_id", type = IdType.AUTO)
    private Integer vipId;

    private Integer userId;

    private LocalDateTime vipstartTime;

    private LocalDateTime vipendTime;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Integer getVipId() {
        return vipId;
    }

    public void setVipId(Integer vipId) {
        this.vipId = vipId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public LocalDateTime getVipstartTime() {
        return vipstartTime;
    }

    public void setVipstartTime(LocalDateTime vipstartTime) {
        this.vipstartTime = vipstartTime;
    }

    public LocalDateTime getVipendTime() {
        return vipendTime;
    }

    public void setVipendTime(LocalDateTime vipendTime) {
        this.vipendTime = vipendTime;
    }
}
