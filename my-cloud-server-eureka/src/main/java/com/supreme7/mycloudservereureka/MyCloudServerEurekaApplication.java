package com.supreme7.mycloudservereureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MyCloudServerEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyCloudServerEurekaApplication.class, args);
    }

}
