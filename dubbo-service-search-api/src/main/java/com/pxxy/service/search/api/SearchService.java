package com.pxxy.service.search.api;

import com.pxxy.service.search.domain.TbItemResult;

import java.util.List;

/**
 * @author YZJ
 * @date 2019/5/14 - 22:46
 */

public interface SearchService {
    public List<TbItemResult> search(String query, int page, int rows);
}
