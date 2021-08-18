package net.biancheng.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @Author: LogicArk
 * @Description:
 * @Date: Created in 2021/8/17 12:38
 */
@ConfigurationProperties(prefix = "net.biancheng")
@Component
public class MyConfig {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
