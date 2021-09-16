package net.biancheng;

import net.biancheng.annotation.EnableUserClient;
import net.biancheng.command.StartCommand;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

/**
 * @Author: LogicArk
 * @Description:
 * @Date: Created in 2021/8/11 13:18
 */
@EnableAsync
@EnableUserClient
@SpringBootApplication
public class App {
    public static void main(String[] args){
//        new StartCommand(args);
        SpringApplication.run(App.class ,args);
    }
}
