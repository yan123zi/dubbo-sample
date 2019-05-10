package com.pxxy.service.user.api;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.github.pagehelper.PageInfo;
import com.pxxy.beans.TbUser;

import java.util.List;

/**
 * @author YZJ
 * @date 2019/5/5 - 16:39
 */
public interface TbUserService {
    /**
     * 查询出所有
     * @return 返回表中所有数据
     */
    List<TbUser> selectAll();

    /**
     * 查询分页数据
     * @param pageNum 页码
     * @param pageSize 笔数
     * @return
     */
    PageInfo<TbUser> page(int pageNum, int pageSize);
}
