package com.bonc;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.bonc.payment.mapper")
public class Payment8001Application {

    public static void main(String[] args) {
        SpringApplication.run(Payment8001Application.class, args);
    }

}
