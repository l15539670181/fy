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
@TableName("spit")
public class Spit implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer spitId;

    private Integer userId;

    private Integer voteId;

    private String spitContent;

    private String spitSuggest;

    public Integer getSpitId() {
        return spitId;
    }

    public void setSpitId(Integer spitId) {
        this.spitId = spitId;
    }

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

    public String getSpitContent() {
        return spitContent;
    }

    public void setSpitContent(String spitContent) {
        this.spitContent = spitContent;
    }

    public String getSpitSuggest() {
        return spitSuggest;
    }

    public void setSpitSuggest(String spitSuggest) {
        this.spitSuggest = spitSuggest;
    }
}
