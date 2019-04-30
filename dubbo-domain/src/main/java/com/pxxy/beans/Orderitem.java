package com.pxxy.beans;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.extension.activerecord.Model;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author yzj
 * @since 2019-04-30
 */
public class Orderitem extends Model<Orderitem> {

private static final long serialVersionUID=1L;

    @TableId(value = "itemid", type = IdType.AUTO)
    private Integer itemid;

    private Integer count;

    private Double subtotal;

    private Integer pid;

    private Integer oid;


    public Integer getItemid() {
        return itemid;
    }

    public void setItemid(Integer itemid) {
        this.itemid = itemid;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(Double subtotal) {
        this.subtotal = subtotal;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public Integer getOid() {
        return oid;
    }

    public void setOid(Integer oid) {
        this.oid = oid;
    }

    @Override
    protected Serializable pkVal() {
        return this.itemid;
    }

    @Override
    public String toString() {
        return "Orderitem{" +
        "itemid=" + itemid +
        ", count=" + count +
        ", subtotal=" + subtotal +
        ", pid=" + pid +
        ", oid=" + oid +
        "}";
    }
}
