package com.wanglibing.log;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import zipkin2.server.internal.EnableZipkinServer;

@SpringBootApplication
@RestController
@EnableZipkinServer
@EnableDiscoveryClient
public class LogApplication {

    @RequestMapping("/")
    public String start() {
        return "hello,兵兵,this is log";
    }

    public static void main(String[] args) {
        SpringApplication.run(LogApplication.class, args);
    }

}

