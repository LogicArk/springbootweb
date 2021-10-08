package net.biancheng.hystrixdemo.command;

import com.netflix.hystrix.HystrixCommand;
import com.netflix.hystrix.HystrixCommandGroupKey;
import com.netflix.hystrix.HystrixCommandProperties;

public class MyHystrixCommand3  extends HystrixCommand<String> {
    private final String name;

    /** 信号量策略配置 */
    public MyHystrixCommand3(String name) {
        super(HystrixCommand.Setter.withGroupKey(HystrixCommandGroupKey.Factory.asKey("MyGroup"))
                .andCommandPropertiesDefaults(HystrixCommandProperties.Setter()
                        .withExecutionIsolationStrategy(HystrixCommandProperties.ExecutionIsolationStrategy.SEMAPHORE)));
        this.name = name;
    }


    @Override
    protected String run() throws Exception {
        return this.name + "：" + Thread.currentThread().getName();
    }
}
