package com.biancheng.feigninheritapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients(basePackages = "com.biancheng.feigninheritapi.client")
@SpringBootApplication
public class FeignInheritApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(FeignInheritApiApplication.class, args);
    }

}
