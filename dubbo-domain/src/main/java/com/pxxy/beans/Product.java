package com.pxxy.beans;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.extension.activerecord.Model;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 
 * </p>
 *
 * @author yzj
 * @since 2019-04-30
 */
public class Product extends Model<Product> {

private static final long serialVersionUID=1L;

    @TableId(value = "pid", type = IdType.AUTO)
    private Integer pid;

    private String pname;

    private Double marketPrice;

    private Double shopPrice;

    private String image;

    private String pdesc;

    private Integer isHot;

    private LocalDateTime pdate;

    private Integer csid;


    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public Double getMarketPrice() {
        return marketPrice;
    }

    public void setMarketPrice(Double marketPrice) {
        this.marketPrice = marketPrice;
    }

    public Double getShopPrice() {
        return shopPrice;
    }

    public void setShopPrice(Double shopPrice) {
        this.shopPrice = shopPrice;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getPdesc() {
        return pdesc;
    }

    public void setPdesc(String pdesc) {
        this.pdesc = pdesc;
    }

    public Integer getIsHot() {
        return isHot;
    }

    public void setIsHot(Integer isHot) {
        this.isHot = isHot;
    }

    public LocalDateTime getPdate() {
        return pdate;
    }

    public void setPdate(LocalDateTime pdate) {
        this.pdate = pdate;
    }

    public Integer getCsid() {
        return csid;
    }

    public void setCsid(Integer csid) {
        this.csid = csid;
    }

    @Override
    protected Serializable pkVal() {
        return this.pid;
    }

    @Override
    public String toString() {
        return "Product{" +
        "pid=" + pid +
        ", pname=" + pname +
        ", marketPrice=" + marketPrice +
        ", shopPrice=" + shopPrice +
        ", image=" + image +
        ", pdesc=" + pdesc +
        ", isHot=" + isHot +
        ", pdate=" + pdate +
        ", csid=" + csid +
        "}";
    }
}