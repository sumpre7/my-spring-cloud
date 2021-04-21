package com.supreme7.mycloudconsumerfeign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author hehuan
 * @Title: my-spring-cloud
 * @date 2021/4/15 下午5:00
 * @Description:  这个接口相当于把原来的服务提供者项目当成一个service类
 */
@FeignClient("my-cloud-provider")
public interface UserClient {

    /**
     * Feign中没有原生的@GetMapping/@PostMapping/@DeleteMapping/@PutMapping，要指定需要用method进行
     *
     *
     * 接口上方用requestmapping指定是服务提供者的哪个controller提供服务
     */
    @RequestMapping(value="/user/sayHello",method= RequestMethod.GET)
    public String sayHello();

    @RequestMapping(value="/user/sayHi",method=RequestMethod.GET)
    public String sayHi();

    @RequestMapping(value="/user/sayHaha",method=RequestMethod.GET)
    public String sayHaha();


}
