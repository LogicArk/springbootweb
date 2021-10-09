package net.biancheng.hystrixdemo.command;

import com.netflix.hystrix.strategy.concurrency.HystrixRequestContext;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public class MyHystrixCommand5Test {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        HystrixRequestContext context = HystrixRequestContext.initializeContext();

        /** 同步调用 */
        String result = new MyHystrixCommand5("zhangsan").execute();
        System.out.println(result);

        /** 异步调用 */
        Future<String> future = new MyHystrixCommand5("zhangsan").queue();
        System.out.println(future.get());

        context.shutdown();
    }
}
