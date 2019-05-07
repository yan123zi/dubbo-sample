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
 * 
 * </p>
 *
 * @author yzj
 * @since 2019-05-05
 */
@Data
public class TbOrderShipping extends Model<TbOrderShipping> implements Serializable{

private static final long serialVersionUID=1L;

    /**
     * 订单ID
     */
    @TableId(value = "order_id", type = IdType.AUTO)
    private String orderId;

    /**
     * 收货人全名
     */
    private String receiverName;

    /**
     * 固定电话
     */
    private String receiverPhone;

    /**
     * 移动电话
     */
    private String receiverMobile;

    /**
     * 省份
     */
    private String receiverState;

    /**
     * 城市
     */
    private String receiverCity;

    /**
     * 区/县
     */
    private String receiverDistrict;

    /**
     * 收货地址，如：xx路xx号
     */
    private String receiverAddress;

    /**
     * 邮政编码,如：310001
     */
    private String receiverZip;

    private Date created;

    private Date updated;



    @Override
    protected Serializable pkVal() {
        return this.orderId;
    }

}
