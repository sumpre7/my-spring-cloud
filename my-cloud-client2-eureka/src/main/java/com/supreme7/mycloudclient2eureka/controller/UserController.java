package com.supreme7.mycloudclient2eureka.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author hehuan
 * @Title: my-spring-cloud
 * @date 2021/4/14 下午3:28
 * @Description:
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Value("${server.port}")
    private String port;

    @RequestMapping("/sayHello")
    public String sayhello(){
        return "I`m provider "+port+" ,Hello consumer!";
    }
    @RequestMapping("/sayHi")
    public String sayHi(){
        return "I`m provider "+port+" ,Hello consumer!";
    }
    @RequestMapping("/sayHaha")
    public String sayHaha(){
        return "I`m provider "+port+" ,Hello consumer!";
    }

}
