package net.biancheng.endpoint;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author: LogicArk
 * @Description: UserHealthIndicator是在框架自带的 health 端点中进行扩展，还有一种需求是完全开发一个全新的端点，比如查看当前登录的用户信息的端点。自定义全新的端点很简单，通过 @Endpoint 注解就可以实现
 * @Date: Created in 2021/8/17 13:15
 */
@Component
@Endpoint(id = "user")
public class UserEndpoint {

    @ReadOperation
    public List<Map<String,Object>> health(){
        List<Map<String,Object>> list = new ArrayList<>();
        Map<String,Object> map = new HashMap<>();
        map.put("userId","1001");
        map.put("userName","zhangSan");
        list.add(map);
        return list;
    }
}
