package com.pxxy.service.search.provider.mapper;

import com.pxxy.service.search.domain.TbItemResult;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author YZJ
 * @date 2019/5/15 - 15:18
 */
public interface TbItemResultMapper {

    List<TbItemResult> selectAll();
}
