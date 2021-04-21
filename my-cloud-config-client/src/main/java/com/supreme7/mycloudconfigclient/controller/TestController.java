package com.supreme7.mycloudconfigclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author hehuan
 * @Title: my-spring-cloud
 * @date 2021/4/20 下午10:54
 * @Description:
 */
@RestController
public class TestController {
    @Value("${supreme7.config.server.name}")
    private String name;

    @GetMapping("/name")
    public String getName() {
        return name;
    }
}
