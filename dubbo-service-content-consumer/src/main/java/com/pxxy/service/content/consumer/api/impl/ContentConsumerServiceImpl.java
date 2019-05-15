package com.pxxy.service.content.consumer.api.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.pxxy.service.content.api.ContentConsumerService;

/**
 * @author YZJ
 * @date 2019/5/10 - 20:58
 */
@Service(version = "${services.versions.content.v1}")
public class ContentConsumerServiceImpl implements ContentConsumerService {
    @Override
    public void info() {

    }
}
