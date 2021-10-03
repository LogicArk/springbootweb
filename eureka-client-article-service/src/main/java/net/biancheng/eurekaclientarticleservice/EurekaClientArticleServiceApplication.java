package net.biancheng.eurekaclientarticleservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableDiscoveryClient
@SpringBootApplication
@EnableFeignClients(basePackages = {"net.biancheng.eurekaclientarticleservice.client",
        "com.biancheng.feigninheritapi.client"})
public class EurekaClientArticleServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaClientArticleServiceApplication.class, args);
    }

}
