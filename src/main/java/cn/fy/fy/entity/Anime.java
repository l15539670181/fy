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
@TableName("anime")
public class Anime implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "anime_id", type = IdType.AUTO)
    private Integer animeId;

    public Integer getAnimeId() {
        return animeId;
    }

    public void setAnimeId(Integer animeId) {
        this.animeId = animeId;
    }

    public Integer getAnimeTypeId() {
        return animeTypeId;
    }

    public void setAnimeTypeId(Integer animeTypeId) {
        this.animeTypeId = animeTypeId;
    }

    public String getAnimeName() {
        return animeName;
    }

    public void setAnimeName(String animeName) {
        this.animeName = animeName;
    }

    public String getAnimeIntroduce() {
        return animeIntroduce;
    }

    public void setAnimeIntroduce(String animeIntroduce) {
        this.animeIntroduce = animeIntroduce;
    }

    private Integer animeTypeId;

    private String animeName;

    private String animeIntroduce;

    private AnimeType animeType;

    public AnimeType getAnimeType() {
        return animeType;
    }

    public void setAnimeType(AnimeType animeType) {
        this.animeType = animeType;
    }

}
