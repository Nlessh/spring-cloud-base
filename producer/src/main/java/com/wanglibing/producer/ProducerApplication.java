package com.wanglibing.producer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
@RestController
@EnableCircuitBreaker        //启动断路器，如果要监控hystrix的流必须开启此注解
@EnableHystrixDashboard
public class ProducerApplication {

    @RequestMapping("/")
    public String start() {
        return "hello,兵兵,this is producer";
    }

    public static void main(String[] args) {
        SpringApplication.run(ProducerApplication.class, args);
    }

}

