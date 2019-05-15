package com.pxxy.service.content.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @author YZJ
 * @date 2019/5/10 - 16:04
 */
@SpringBootApplication(scanBasePackages = "com.pxxy",exclude = DataSourceAutoConfiguration.class)
@EnableHystrixDashboard
@EnableHystrix
public class MyShopServiceContentConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(MyShopServiceContentConsumerApplication.class,args);
    }
}
