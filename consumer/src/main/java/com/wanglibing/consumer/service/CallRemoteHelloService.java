package com.wanglibing.consumer.service;

import com.wanglibing.consumer.service.impl.CallRemoteHelloServiceImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author: iamwlb
 * @date: 2018/12/18 10:54
 */
@FeignClient(name= "producer",fallback = CallRemoteHelloServiceImpl.class)
public interface CallRemoteHelloService {

    @RequestMapping(value = "/hello")
    public String hello(@RequestParam(value = "name") String name);

}
