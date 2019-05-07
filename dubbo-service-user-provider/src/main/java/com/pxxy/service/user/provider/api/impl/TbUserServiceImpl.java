package com.pxxy.service.user.provider.api.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.pxxy.beans.TbUser;
import com.pxxy.mapper.TbUserMapper;
import com.pxxy.service.user.api.TbUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author YZJ
 * @date 2019/5/5 - 22:00
 */
@Service(version = "${services.versions.user.v1}")
@Transactional(readOnly = true)
public class TbUserServiceImpl implements TbUserService {
    @Autowired
    private TbUserMapper tbUserMapper;
    @Override
    public List<TbUser> selectAll() {
        return tbUserMapper.selectList(null);
    }
}
