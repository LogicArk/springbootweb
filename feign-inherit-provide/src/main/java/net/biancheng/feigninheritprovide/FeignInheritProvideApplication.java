package net.biancheng.feigninheritprovide;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;


@SpringBootApplication
public class FeignInheritProvideApplication {

    public static void main(String[] args) {
        SpringApplication.run(FeignInheritProvideApplication.class, args);
    }

}
