package com.supreme7.mycloudconfigclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MyCloudConfigClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyCloudConfigClientApplication.class, args);
    }

}
