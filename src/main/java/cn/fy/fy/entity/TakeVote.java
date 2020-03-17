package cn.fy.fy.entity;

import com.baomidou.mybatisplus.annotation.TableName;
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
@TableName("take_vote")
public class TakeVote implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 外键用户id
     */
    private Integer userId;

    /**
     * 投票外键id
     */
    private Integer voteId;

    /**
     * 外键选项id
     */
    private Integer voteNeedId;

    /**
     * 外键礼物id
     */
    private Integer giftId;

    /**
     * 礼物的数量
     */
    private Integer giftAmount;


}
