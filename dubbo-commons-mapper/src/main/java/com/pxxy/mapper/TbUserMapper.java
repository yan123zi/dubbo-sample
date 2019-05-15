package com.pxxy.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.pxxy.beans.TbUser;
import com.pxxy.utils.RedisCache;
import org.apache.ibatis.annotations.CacheNamespace;

/**
 * <p>
 * 用户表 Mapper 接口
 * </p>
 *
 * @author yzj
 * @since 2019-05-05
 */
@CacheNamespace(implementation = RedisCache.class)
public interface TbUserMapper extends BaseMapper<TbUser> {

}
