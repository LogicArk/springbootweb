package net.biancheng.springbootstarterdemo.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * 用户属性配置类
 */
@Data
@ConfigurationProperties("spring.user")
public class UserProperties {

    private String name;

}
