package com.biancheng.feigninheritapi.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("feign-inherit-provide")
public interface UserRemoteClient2 {

    @GetMapping("/user/name")
    String getName();
}
