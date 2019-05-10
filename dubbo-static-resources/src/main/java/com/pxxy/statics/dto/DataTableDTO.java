package com.pxxy.statics.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author YZJ
 * @date 2019/5/10 - 11:23
 */
@Data
public class DataTableDTO<T> implements Serializable {
    private int draw;
    private long recordsTotal;
    private long recordsFiltered;
    private List<T> data;
    private String error;
}