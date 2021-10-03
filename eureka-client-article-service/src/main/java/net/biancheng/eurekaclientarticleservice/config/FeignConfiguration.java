package net.biancheng.eurekaclientarticleservice.config;


import feign.Contract;
import feign.Logger;
import feign.Request;
import feign.auth.BasicAuthRequestInterceptor;
import net.biancheng.eurekaclientarticleservice.interceptor.FeignBasicAuthRequestInterceptor;
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

    /**
     * 通常我们调用的接口都是有权限控制的，很多时候可能认证的值是通过参数去传递的，还有就是通过请求头去传递认证信息，
     * 比如 Basic 认证方式。在 Feign 中我们可以直接配置 Basic 认证，代码如下所示
     * @return
     */
//    @Bean
//    public BasicAuthRequestInterceptor basicAuthRequestInterceptor(){
//        return new BasicAuthRequestInterceptor("user", "password");
//    }

    /**
     * 或者你可以自定义属于自己的认证方式，其实就是自定义一个请求拦截器。
     * 在请求之前做认证操作，然后往请求头中设置认证之后的信息。通过实现 RequestInterceptor 接口来自定义认证方式
     * @return
     */
//    @Bean
//    public FeignBasicAuthRequestInterceptor feignBasicAuthRequestInterceptor(){
//        return new FeignBasicAuthRequestInterceptor();
//    }

    /**
     * 通过 Options 可以配置连接超时时间和读取超时时间（代码如下所示），Options 的第一个参数是连接超时时间（ms），
     * 默认值是 10×1000；第二个是取超时时间（ms），默认值是 60×1000。
     * @return
     */
    @Bean
    public Request.Options options(){
        return new Request.Options(5000,10000);
    }
}
