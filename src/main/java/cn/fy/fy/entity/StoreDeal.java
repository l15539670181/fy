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
@TableName("store_deal")
public class StoreDeal implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "store_deal_id", type = IdType.AUTO)
    private Integer storeDealId;

    private String storeDeal;

    private Integer userId;

    private Integer storeId;

    private Integer storeDealQuantity;

    private Double storeDealMoney;


}
