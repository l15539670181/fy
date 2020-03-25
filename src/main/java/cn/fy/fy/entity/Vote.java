package cn.fy.fy.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
import java.util.Date;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import org.springframework.format.annotation.DateTimeFormat;

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
@TableName("vote")
public class Vote implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "vote_id", type = IdType.AUTO)
    private Integer voteId;

    /**
     * 外键用户id
     */
    private Integer userId;

    /**
     * 外键动漫表id
     */
    private Integer animeId;

    private String voteTitle;

    private Date voteStart;

    private Date voteEnd;

    private Anime anime;

    public Anime getAnime() {
        return anime;
    }

    public void setAnime(Anime anime) {
        this.anime = anime;
    }

    private  VotePerson votePerson;

    public VotePerson getVotePerson() {
        return votePerson;
    }

    public void setVotePerson(VotePerson votePerson) {
        this.votePerson = votePerson;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Integer getVoteId() {
        return voteId;
    }

    public void setVoteId(Integer voteId) {
        this.voteId = voteId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getAnimeId() {
        return animeId;
    }

    public void setAnimeId(Integer animeId) {
        this.animeId = animeId;
    }

    public String getVoteTitle() {
        return voteTitle;
    }

    public Date getVoteStart() {
        return voteStart;
    }

    public void setVoteStart(Date voteStart) {
        this.voteStart = voteStart;
    }

    public Date getVoteEnd() {
        return voteEnd;
    }

    public void setVoteEnd(Date voteEnd) {
        this.voteEnd = voteEnd;
    }

    public void setVoteTitle(String voteTitle) {
        this.voteTitle = voteTitle;
    }


}
