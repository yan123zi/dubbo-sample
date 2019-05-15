package com.pxxy.service.content.api;

import com.github.pagehelper.PageInfo;
import com.pxxy.beans.TbContent;

/**
 * @author YZJ
 * @date 2019/5/10 - 15:41
 */
public interface TbContentService {
    /**
     * 分页查询
     * @param pageNum
     * @param pageSize
     * @return
     */
    PageInfo<TbContent> page(int pageNum, int pageSize);
}
