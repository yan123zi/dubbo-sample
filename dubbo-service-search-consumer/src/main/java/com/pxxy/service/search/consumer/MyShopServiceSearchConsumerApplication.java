package com.pxxy.service.search.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @author YZJ
 * @date 2019/5/15 - 16:13
 */
@EnableHystrix
@EnableHystrixDashboard
@SpringBootApplication(scanBasePackages = "com.pxxy", exclude = DataSourceAutoConfiguration.class)
public class MyShopServiceSearchConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(MyShopServiceSearchConsumerApplication.class,args);
    }
}
