package net.biancheng.hystrixdemo.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class HelloController {

    @RequestMapping("/callHello")
    @HystrixCommand(fallbackMethod = "defaultCallHello",commandProperties = {
            @HystrixProperty(name = "execution.isolation.strategy",value = "THREAD")
    })
    public String callHello(){
        RestTemplate restTemplate = new RestTemplate();
        String result = restTemplate.getForObject("http://localhost:8080/hello",String.class);
        return result;
    }

    public String defaultCallHello(){
        return "fail";
    }
}
