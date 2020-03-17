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


}
