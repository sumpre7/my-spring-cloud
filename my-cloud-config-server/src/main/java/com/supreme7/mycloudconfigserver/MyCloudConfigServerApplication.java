package com.supreme7.mycloudconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableConfigServer
@EnableEurekaClient
@SpringBootApplication
public class MyCloudConfigServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyCloudConfigServerApplication.class, args);
        System.out.println("---配置中心服务端启动成功!");
    }

}
