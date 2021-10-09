package net.biancheng.hystrixdemo.command;

import com.netflix.hystrix.strategy.concurrency.HystrixRequestContext;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public class ClearCacheHystrixCommandTest {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        HystrixRequestContext context = HystrixRequestContext.initializeContext();

        String result = new ClearCacheHystrixCommand("zhangsan").execute();
        System.out.println(result);

        ClearCacheHystrixCommand.flushCache("zhangsan");//清除缓存

        Future<String> future = new ClearCacheHystrixCommand("zhangsan").queue();
        System.out.println(future.get());
    }

}
