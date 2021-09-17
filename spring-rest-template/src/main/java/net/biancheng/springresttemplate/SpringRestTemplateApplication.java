package net.biancheng.springresttemplate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class SpringRestTemplateApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringRestTemplateApplication.class, args);
    }

}
