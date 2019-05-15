package com.pxxy.service.search.domain;

import lombok.Data;

import java.io.Serializable;

/**
 * @author YZJ
 * @date 2019/5/14 - 22:47
 */
@Data
public class TbItemResult implements Serializable {
    private long id;
    private long tb_item_cid;
    private String tb_item_cname;
    private String tb_item_title;
    private String tb_item_sell_point;
}
