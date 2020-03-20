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
@TableName("vote_person")
public class VotePerson implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 投票外键id
     */
    private Integer voteId;

    private Integer votePersonPersons;

    private Double votePersonMoney;

    private Integer userId;


    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Integer getVoteId() {
        return voteId;
    }

    public void setVoteId(Integer voteId) {
        this.voteId = voteId;
    }

    public Integer getVotePersonPersons() {
        return votePersonPersons;
    }

    public void setVotePersonPersons(Integer votePersonPersons) {
        this.votePersonPersons = votePersonPersons;
    }

    public Double getVotePersonMoney() {
        return votePersonMoney;
    }

    public void setVotePersonMoney(Double votePersonMoney) {
        this.votePersonMoney = votePersonMoney;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

}
