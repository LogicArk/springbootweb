package net.biancheng.hystrixdemo.command;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public class MyHystrixCommandTest {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        /** 同步调用 */
        String result = new MyHystrixCommand("zhangsan").execute();
        System.out.println(result);

        /** 异步调用 */
        Future<String> future = new MyHystrixCommand("zhangsan").queue();
        System.out.println(future.get());

        /** 同步调用-模拟回退 */
        String result2 = new MyHystrixCommand2("zhangsan").execute();
        System.out.println(result2);
    }
}
