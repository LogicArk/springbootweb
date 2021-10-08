package net.biancheng.hystrixdemo.command;

import com.netflix.hystrix.HystrixCommand;
import com.netflix.hystrix.HystrixCommandGroupKey;

public class MyHystrixCommand extends HystrixCommand<String> {

    private final String name;

    public MyHystrixCommand(String name) {
        super(HystrixCommandGroupKey.Factory.asKey("MyGroup"));
        this.name = name;
    }


    @Override
    protected String run() throws Exception {
        return this.name + "：" + Thread.currentThread().getName();
    }
}
