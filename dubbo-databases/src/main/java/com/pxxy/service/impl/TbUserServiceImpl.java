package com.pxxy.service.impl;

import com.pxxy.beans.TbUser;
import com.pxxy.mapper.TbUserMapper;
import com.pxxy.service.TbUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户表 服务实现类
 * </p>
 *
 * @author yzj
 * @since 2019-05-05
 */
@Service
public class TbUserServiceImpl extends ServiceImpl<TbUserMapper, TbUser> implements TbUserService {

}
