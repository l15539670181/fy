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

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getVoteId() {
        return voteId;
    }

    public void setVoteId(Integer voteId) {
        this.voteId = voteId;
    }

    public Integer getVoteNeedId() {
        return voteNeedId;
    }

    public void setVoteNeedId(Integer voteNeedId) {
        this.voteNeedId = voteNeedId;
    }

    public Integer getGiftId() {
        return giftId;
    }

    public void setGiftId(Integer giftId) {
        this.giftId = giftId;
    }

    public Integer getGiftAmount() {
        return giftAmount;
    }

    public void setGiftAmount(Integer giftAmount) {
        this.giftAmount = giftAmount;
    }
}
