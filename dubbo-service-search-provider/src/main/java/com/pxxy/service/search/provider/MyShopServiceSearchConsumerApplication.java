package com.pxxy.service.search.provider;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @author YZJ
 * @date 2019/5/14 - 23:05
 */
@EnableHystrixDashboard
@EnableHystrix
@SpringBootApplication(scanBasePackages = "com.pxxy")
@MapperScan("com.pxxy.service.search.provider.mapper")
public class MyShopServiceSearchConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(MyShopServiceSearchConsumerApplication.class,args);
    }
}
