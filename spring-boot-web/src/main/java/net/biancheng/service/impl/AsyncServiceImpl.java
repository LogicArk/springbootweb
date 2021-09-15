package net.biancheng.service.impl;

import net.biancheng.service.AsyncService;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

/**
 * @Author: LogicArk
 * @Description:
 * @Date: Created in 2021/8/19 12:52
 */
@Component
public class AsyncServiceImpl implements AsyncService {

    @Async
    @Override
    public void saveLog(){
        System.out.println(Thread.currentThread().getName());
    }
}
