package com.wanglibing.consumer.service.impl;

import com.wanglibing.consumer.service.CallRemoteHelloService;
import org.springframework.stereotype.Component;

/**
 * @author: iamwlb
 * @date: 2018/12/18 13:17
 */
@Component
public class CallRemoteHelloServiceImpl implements CallRemoteHelloService {

    @Override
    public String hello(String name) {
        return "hello" +name+", this messge send failed ";
    }
}
