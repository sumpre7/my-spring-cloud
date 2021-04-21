package com.supreme7.mycloudclienteureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
// 之前老版本需要加此注解，新版本可不用添加
// @EnableEurekaClient
public class MyCloudClientEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyCloudClientEurekaApplication.class, args);
    }

}
