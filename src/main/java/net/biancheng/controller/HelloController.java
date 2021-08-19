package net.biancheng.controller;

import net.biancheng.config.MyConfig;
import net.biancheng.service.AsyncService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: LogicArk
 * @Description:
 * @Date: Created in 2021/8/11 13:21
 */
@RestController
public class HelloController {

    @Autowired
    private Environment env ;

    @Value("${server.port}")
    private String serverPort;

    @Autowired
    private MyConfig myConfig;

    @Autowired
    private AsyncService asyncService;

    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }

    /**
     * 通过 Environment 对象获取配置文件中的信息
     * @return
     */
    @GetMapping("/getConfigInfoByEnv")
    public String getConfigInfoByEnv(){
        String serverPort = env.getProperty("server.port");
        return serverPort;
    }

    /**
     * 通多类字段，获取配置文件中的信息
     * @return
     */
    @GetMapping("/getConfigInfoByField")
    public String getConfigInfoByField(){
        return serverPort;
    }

    /**
     * 通过实体类对象，获取配置文件中的信息
     * @return
     */
    @GetMapping("/getConfigInfoByObj")
    public String getConfigInfoByObj(){
        return myConfig.getName();
    }

    /**
     * 测试全局异常处理
     * @return
     */
    @GetMapping("/testGlobalExceptionHandler")
    public String testGlobalExceptionHandler(){
        Object a = null;
        System.out.println(a.toString());
        return "测试全局异常处理";
    }

    /**
     * 测试异步操作
     */
    @GetMapping("/testAsync")
    public void testAsync(){
        System.out.println("调用异步前。。。");
        asyncService.saveLog();
        System.out.println("调用异步后。。。");
    }

}
