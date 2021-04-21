package com.supreme7.mycloudconsumerfeign.controller;

import com.supreme7.mycloudconsumerfeign.service.UserClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author hehuan
 * @Title: my-spring-cloud
 * @date 2021/4/14 下午5:27
 * @Description:
 */
@RestController
public class HelloController {

    @Autowired
    private UserClient feignUserClient;

    @Autowired
    private DiscoveryClient discoveryClient;
    /**
     * 此处的mapping是一级controller，调用方法里边绑定了二级的conroller，相当于用http完成一次转发
     * @return
     */
    @GetMapping("/hello")
    public String hello(){
        return feignUserClient.sayHello();
    }

    @GetMapping("/hi")
    public String hi(){
        return feignUserClient.sayHi();
    }

    @GetMapping("/haha")
    public String haha(){
        return feignUserClient.sayHaha();
    }

    @GetMapping("client")
    public String getclient(){
        List<String> instances = discoveryClient.getServices();

        String result= null;
        for (String instance : instances) {
            System.out.println(instance);
            result += instance +"###";
        }
        return result;
    }

    @GetMapping("client2")
    public String getclient2(){
        List<ServiceInstance> instances = discoveryClient.getInstances("my-cloud-provider");

        return instances.get(0).toString();
    }

}
