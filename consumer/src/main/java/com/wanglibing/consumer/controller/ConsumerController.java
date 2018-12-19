package com.wanglibing.consumer.controller;

import com.wanglibing.consumer.service.CallRemoteHelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: iamwlb
 * @date: 2018/12/18 11:15
 */
@RestController
public class ConsumerController {
    @Autowired
    CallRemoteHelloService callRemoteHelloService;

    @RequestMapping("/hello/{name}")
    public String index(@PathVariable("name") String name) {
        return callRemoteHelloService.hello(name);
    }
}
