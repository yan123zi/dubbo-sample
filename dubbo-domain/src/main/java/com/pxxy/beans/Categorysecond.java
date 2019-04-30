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
public class Categorysecond extends Model<Categorysecond> {

private static final long serialVersionUID=1L;

    @TableId(value = "csid", type = IdType.AUTO)
    private Integer csid;

    private String csname;

    private Integer cid;


    public Integer getCsid() {
        return csid;
    }

    public void setCsid(Integer csid) {
        this.csid = csid;
    }

    public String getCsname() {
        return csname;
    }

    public void setCsname(String csname) {
        this.csname = csname;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    @Override
    protected Serializable pkVal() {
        return this.csid;
    }

    @Override
    public String toString() {
        return "Categorysecond{" +
        "csid=" + csid +
        ", csname=" + csname +
        ", cid=" + cid +
        "}";
    }
}
