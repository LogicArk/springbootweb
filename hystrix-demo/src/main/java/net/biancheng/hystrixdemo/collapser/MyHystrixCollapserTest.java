package net.biancheng.hystrixdemo.collapser;

import com.netflix.hystrix.strategy.concurrency.HystrixRequestContext;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public class MyHystrixCollapserTest {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        HystrixRequestContext context = HystrixRequestContext.initializeContext();

        Future<String> f1 = new MyHystrixCollapser("zhangsan").queue();
        Future<String> f2 = new MyHystrixCollapser("zhangsan333").queue();
        System.out.println(f1.get() + "=" + f2.get());

        context.shutdown();
    }
}
