package com.pxxy.service.content.provider.api.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.pxxy.beans.TbContent;
import com.pxxy.beans.TbUser;
import com.pxxy.mapper.TbContentMapper;
import com.pxxy.service.content.api.TbContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;


/**
 * @author YZJ
 * @date 2019/5/10 - 15:44
 */
@Service(version = "${services.versions.content.v1}")
@Transactional(readOnly = true)
public class TbContentServiceImpl implements TbContentService {
    @Autowired
    private TbContentMapper tbContentMapper;
    @Override
    public PageInfo<TbContent> page(int pageNum, int pageSize) {
        PageHelper.offsetPage(pageNum, pageSize);
        PageInfo<TbContent> pageInfo = new PageInfo<TbContent>(tbContentMapper.selectList(null));
        return pageInfo;
    }
}
