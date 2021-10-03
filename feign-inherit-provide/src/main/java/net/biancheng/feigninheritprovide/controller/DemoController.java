package net.biancheng.feigninheritprovide.controller;

import com.biancheng.feigninheritapi.client.UserRemoteClient2;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController implements UserRemoteClient2 {

    @Override
    public String getName() {
        return "zhangsan";
    }
}
