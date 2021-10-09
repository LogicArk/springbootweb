package net.biancheng.hystrixdemo.command;

import com.netflix.hystrix.HystrixCommand;
import com.netflix.hystrix.HystrixCommandGroupKey;

public class MyHystrixCommand5 extends HystrixCommand<String> {

    private final String name;

    public MyHystrixCommand5(String name) {
        super(HystrixCommandGroupKey.Factory.asKey("MyGroup"));
        this.name = name;
    }

    @Override
    protected String getCacheKey(){
        return String.valueOf(this.name);
    }

    @Override
    protected String run() throws Exception {
        System.err.println("get data");
        return this.name + "：" + Thread.currentThread().getName();
    }
}
