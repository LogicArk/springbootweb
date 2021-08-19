package net.biancheng;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

/**
 * @Author: LogicArk
 * @Description:
 * @Date: Created in 2021/8/11 13:18
 */
@EnableAsync
@SpringBootApplication
public class App {
    public static void main(String[] args){
        SpringApplication.run(App.class ,args);
    }
}
