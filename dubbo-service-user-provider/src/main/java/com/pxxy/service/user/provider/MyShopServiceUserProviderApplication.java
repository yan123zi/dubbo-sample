package com.pxxy.service.user.provider;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author YZJ
 * @date 2019/5/5 - 16:47
 */
@SpringBootApplication(scanBasePackages = "com.pxxy")
@EnableHystrix
@EnableHystrixDashboard
@EnableTransactionManagement
@MapperScan(basePackages = "com.pxxy.mapper")
public class MyShopServiceUserProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(MyShopServiceUserProviderApplication.class,args);
    }
}


