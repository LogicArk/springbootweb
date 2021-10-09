package net.biancheng.hystrixdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableDiscoveryClient
@EnableHystrix
@EnableFeignClients(basePackages = "net.biancheng.hystrixdemo.client")
@SpringBootApplication
public class HystrixDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(HystrixDemoApplication.class, args);
    }

}
