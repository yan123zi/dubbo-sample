package com.pxxy.service.user.provider.api.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
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
    @Override
    public PageInfo<TbUser> page(int pageNum, int pageSize) {

        System.out.println(5);
        /*Example example = new Example(TbUser.class);
        example.createCriteria()
                .andLike("username", username != null ? username + "%" : null)
                .andLike("phone", phone != null ? phone + "%" : null)
                .andLike("email", email != null ? email + "%" : null);*/
        PageHelper.offsetPage(pageNum, pageSize);
        PageInfo<TbUser> pageInfo = new PageInfo<TbUser>(tbUserMapper.selectList(null));

        return pageInfo;
    }

}
