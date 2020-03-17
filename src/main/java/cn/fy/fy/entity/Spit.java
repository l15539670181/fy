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


}
