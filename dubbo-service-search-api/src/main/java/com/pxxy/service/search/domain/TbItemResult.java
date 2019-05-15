package com.pxxy.service.search.domain;

import lombok.Data;

import java.io.Serializable;

/**
 * @author YZJ
 * @date 2019/5/14 - 22:47
 */
@Data
public class TbItemResult implements Serializable {
    private Long id;
    private Long tbItemCid;
    private String tbItemCname;
    private String tbItemTitle;
    private String tbItemSellPoint;
    private String tbItemDesc;
}
