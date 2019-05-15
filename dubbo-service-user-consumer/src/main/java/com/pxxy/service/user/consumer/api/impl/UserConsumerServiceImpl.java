package com.pxxy.service.user.consumer.api.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.pxxy.service.user.api.UserConsumerService;

/**
 * @author YZJ
 * @date 2019/5/10 - 17:16
 */
@Service(version = "${services.versions.user.v1}")
public class UserConsumerServiceImpl implements UserConsumerService {
    @Override
    public void info() {

    }
}
