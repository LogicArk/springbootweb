package net.biancheng.springbootstarterdemo.config;

import net.biancheng.springbootstarterdemo.client.UserClient;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 先说作用：
 * @EnableConfigurationProperties注解的作用是：使使用 @ConfigurationProperties 注解的类生效。
 * 说明：
 * 用springboot开发的过程中，我们会用到@ConfigurationProperties注解，主要是用来把properties或者yml配置文件转化为bean来使用的，而@EnableConfigurationProperties注解的作用是@ConfigurationProperties注解生效。
 * 如果只配置@ConfigurationProperties注解，在IOC容器中是获取不到properties配置文件转化的bean的，当然在@ConfigurationProperties加入注解的类上加@Component也可以使交于springboot管理。
 *
 * 说白了 @EnableConfigurationProperties 相当于把使用 @ConfigurationProperties 的类进行了一次注入。
 */
@Configuration
@EnableConfigurationProperties(UserProperties.class)
public class UserAutoConfigure {

    /**
     * @Bean是一个方法级别上的注解，主要用在@Configuration注解的类里，也可以用在@Component注解的类里。添加的bean的id为方法名
     * @ConditionalOnProperty 从配置文件中获取某个值，与定义的值比较，决定Bean是否创建；
     */
    @Bean
    @ConditionalOnProperty(prefix = "spring.user" ,value = "enabled",havingValue = "true")
    public UserClient userClient(UserProperties userProperties){
        return new UserClient(userProperties);
    }
}
