package com.pxxy.service.content.provider;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author YZJ
 * @date 2019/5/10 - 15:48
 */
@SpringBootApplication(scanBasePackages = "com.pxxy")
@EnableHystrix
@EnableHystrixDashboard
@EnableTransactionManagement
@MapperScan(basePackages = "com.pxxy.mapper")
public class MyShopServiceContentProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(MyShopServiceContentProviderApplication.class,args);
    }
}
