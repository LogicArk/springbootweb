package net.biancheng.eurekaclientarticleservice.controller;

import com.biancheng.feigninheritapi.client.UserRemoteClient2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @Autowired
    private UserRemoteClient2 userRemoteClient;

    @GetMapping("/call")
    public String callHello() {
        String result = userRemoteClient.getName();
        System.out.println("getName调用结果：" + result);
        return result;
    }
}
