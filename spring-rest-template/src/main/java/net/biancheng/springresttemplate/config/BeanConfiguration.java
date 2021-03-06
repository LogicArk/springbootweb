package net.biancheng.springresttemplate.config;

import net.biancheng.springresttemplate.annotation.MyLoadBalanced;
import net.biancheng.springresttemplate.rule.MyRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class BeanConfiguration {

    @Bean
    @LoadBalanced
//    @MyLoadBalanced
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }

    @Bean
    public MyRule rule(){
        return new MyRule();
    }
}
