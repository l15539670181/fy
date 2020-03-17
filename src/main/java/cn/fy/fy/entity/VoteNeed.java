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
@TableName("vote_need")
public class VoteNeed implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 外键投票id
     */
    private Integer voteId;

    @TableId(value = "vote_need_id", type = IdType.AUTO)
    private Integer voteNeedId;

    private String voteNeedName;

    private Integer voteConditionVotes;


}
