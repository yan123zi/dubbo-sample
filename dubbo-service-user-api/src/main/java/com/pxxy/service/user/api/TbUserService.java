package com.pxxy.service.user.api;

import com.pxxy.beans.TbUser;

import java.util.List;

/**
 * @author YZJ
 * @date 2019/5/5 - 16:39
 */
public interface TbUserService {
    List<TbUser> selectAll();
}
