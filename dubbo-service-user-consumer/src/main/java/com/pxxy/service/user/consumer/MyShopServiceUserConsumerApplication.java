package com.pxxy.service.user.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @author YZJ
 * @date 2019/5/6 - 19:09
 */
@SpringBootApplication(scanBasePackages = "com.pxxy",exclude = DataSourceAutoConfiguration.class)
@EnableHystrixDashboard
@EnableHystrix
public class MyShopServiceUserConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(MyShopServiceUserConsumerApplication.class,args);
    }
}
