package com.pxxy.service.redis.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @author YZJ
 * @date 2019/5/12 - 22:22
 */
@EnableHystrix
@EnableHystrixDashboard
@SpringBootApplication
public class MyShopServiceRedisProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(MyShopServiceRedisProviderApplication.class,args);
    }
}
