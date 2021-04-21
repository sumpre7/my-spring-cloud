package com.supreme7.mycloudconsumerfeign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
// 表明这是一个eureka客户端
@EnableEurekaClient
// 开启feign
@EnableFeignClients
public class MyCloudConsumerFeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyCloudConsumerFeignApplication.class, args);
    }

}
