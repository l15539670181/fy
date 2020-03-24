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
@TableName("store_deal")
public class StoreDeal implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "store_deal_id", type = IdType.AUTO)
    private Integer storeDealId;

    private String storeDeal;

    private Integer userId;

    private Integer storeId;

    private Integer storeDealQuantity;

    private Double storeDealMoney;

    private Integer storeDealCount;

    public Integer getStoreDealCount() {
        return storeDealCount;
    }

    public void setStoreDealCount(Integer storeDealCount) {
        this.storeDealCount = storeDealCount;
    }

    private Store store;

    private UserMessage userMessage;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Integer getStoreDealId() {
        return storeDealId;
    }

    public void setStoreDealId(Integer storeDealId) {
        this.storeDealId = storeDealId;
    }

    public String getStoreDeal() {
        return storeDeal;
    }

    public void setStoreDeal(String storeDeal) {
        this.storeDeal = storeDeal;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getStoreId() {
        return storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    public Integer getStoreDealQuantity() {
        return storeDealQuantity;
    }

    public void setStoreDealQuantity(Integer storeDealQuantity) {
        this.storeDealQuantity = storeDealQuantity;
    }

    public Double getStoreDealMoney() {
        return storeDealMoney;
    }

    public void setStoreDealMoney(Double storeDealMoney) {
        this.storeDealMoney = storeDealMoney;
    }

    public Store getStore() {
        return store;
    }

    public void setStore(Store store) {
        this.store = store;
    }

    public UserMessage getUserMessage() {
        return userMessage;
    }

    public void setUserMessage(UserMessage userMessage) {
        this.userMessage = userMessage;
    }
}
