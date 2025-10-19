package com.easylive;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication(scanBasePackages = "com.easylive")
@MapperScan(basePackages = {"com.easylive.mappers"})
@EnableFeignClients
@EnableScheduling
public class EasyliveCloudWebRunApplication {
    public static void main(String[] args) {
        SpringApplication.run(EasyliveCloudWebRunApplication.class, args);
    }
}
