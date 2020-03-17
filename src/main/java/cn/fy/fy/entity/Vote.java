package cn.fy.fy.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
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

    private LocalDateTime voteStart;

    private LocalDateTime voteEnd;


}
