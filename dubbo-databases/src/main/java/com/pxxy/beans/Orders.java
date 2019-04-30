package com.pxxy.beans;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author yzj
 * @since 2019-04-30
 */
public class Orders extends Model<Orders> {

private static final long serialVersionUID=1L;

    @TableId(value = "oid", type = IdType.AUTO)
    private Integer oid;

    private Double total;

    private LocalDateTime ordertime;

    private Integer state;

    private String name;

    private String phone;

    private String addr;

    private Integer uid;


    public Integer getOid() {
        return oid;
    }

    public void setOid(Integer oid) {
        this.oid = oid;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public LocalDateTime getOrdertime() {
        return ordertime;
    }

    public void setOrdertime(LocalDateTime ordertime) {
        this.ordertime = ordertime;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    @Override
    protected Serializable pkVal() {
        return this.oid;
    }

    @Override
    public String toString() {
        return "Orders{" +
        "oid=" + oid +
        ", total=" + total +
        ", ordertime=" + ordertime +
        ", state=" + state +
        ", name=" + name +
        ", phone=" + phone +
        ", addr=" + addr +
        ", uid=" + uid +
        "}";
    }
}
