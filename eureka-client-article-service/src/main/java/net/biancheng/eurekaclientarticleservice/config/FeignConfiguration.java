package net.biancheng.eurekaclientarticleservice.config;


import feign.Contract;
import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class FeignConfiguration {

    /**
     * 日志级别
     * @return
     */
    @Bean
    Logger.Level feignLoggerLevel(){
        return Logger.Level.FULL;
    }

    /**
     * Spring Cloud 在 Feign 的基础上做了扩展，可以让 Feign 支持 Spring MVC 的注解来调用。原生的 Feign 是不支持 Spring MVC 注解的，原生的使用方法我们在后面会讲解。
     *
     * 如果你想在 Spring Cloud 中使用原生的注解方式来定义客户端也是可以的，通过配置契约来改变这个配置，Spring Cloud 中默认的是 SpringMvcContract，代码如下所示
     * @return
     */
//    @Bean
//    public Contract feignContract(){
//        return new feign.Contract.Default();
//    }
}
