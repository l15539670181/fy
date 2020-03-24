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
@TableName("anime_need")
public class AnimeNeed implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer animeId;

    public Integer getAnimeId() {
        return animeId;
    }

    public void setAnimeId(Integer animeId) {
        this.animeId = animeId;
    }

    public String getAnimeMessagePicture() {
        return animeMessagePicture;
    }

    public void setAnimeMessagePicture(String animeMessagePicture) {
        this.animeMessagePicture = animeMessagePicture;
    }

    public String getAnimeMessageIntroduce() {
        return animeMessageIntroduce;
    }

    public void setAnimeMessageIntroduce(String animeMessageIntroduce) {
        this.animeMessageIntroduce = animeMessageIntroduce;
    }

    private String animeMessagePicture;

    private String animeMessageIntroduce;


}
