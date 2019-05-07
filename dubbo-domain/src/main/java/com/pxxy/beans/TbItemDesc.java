package com.pxxy.beans;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

/**
 * <p>
 * 商品描述表
 * </p>
 *
 * @author yzj
 * @since 2019-05-05
 */
@Data
public class TbItemDesc extends Model<TbItemDesc> implements Serializable{

private static final long serialVersionUID=1L;

    /**
     * 商品ID
     */
    @TableId(value = "item_id", type = IdType.AUTO)
    private Long itemId;

    /**
     * 商品描述
     */
    private String itemDesc;

    /**
     * 创建时间
     */
    private Date created;

    /**
     * 更新时间
     */
    private Date updated;


    @Override
    protected Serializable pkVal() {
        return this.itemId;
    }

}
