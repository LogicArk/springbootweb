package net.biancheng.eurekaclientarticleservice.controller;

import com.netflix.discovery.EurekaClient;
import net.biancheng.eurekaclientarticleservice.client.UserRemoteClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ArticleController {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private EurekaClient eurekaClient;

    @Autowired
    private DiscoveryClient discoveryClient;

    @Autowired
    private UserRemoteClient userRemoteClient;

    @GetMapping("/article/callHello")
    public String callHello(){
        return restTemplate.getForObject("http://localhost:8081/user/hello",String.class);
    }

    @GetMapping("/article/callHello2")
    public String callHello2(){
        return restTemplate.getForObject("http://eureka-client-user-service/user/hello",String.class);
    }

    @GetMapping("/article/infos")
    public Object serviceUrl(){
        return eurekaClient.getInstancesByVipAddress("eureka-client-user-service",false);
    }

    @GetMapping("/article/infos2")
    public Object serviceUrl2(){
        return discoveryClient.getInstances("eureka-client-user-service");
    }


    @GetMapping("/callHelloByFeignClient")
    public String callHelloByFeignClient(){
        String result = userRemoteClient.hello();
        System.out.println("输出结果：" + result);
        return result;
    }
}
