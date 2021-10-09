package net.biancheng.hystrixdemo.client;

import feign.hystrix.FallbackFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * 通过 fallback 已经可以实现服务不可用时回退的功能，
 * 如果你想知道触发回退的原因，可以使用 FallbackFactory 来实现回退功能
 */
@Component
public class UserRemoteClientFallbackFactory implements FallbackFactory<UserRemoteClient> {

    private Logger logger = LoggerFactory.getLogger(UserRemoteClientFallbackFactory.class);

    @Override
    public UserRemoteClient create(Throwable cause){
        logger.error("UserRemoteClient回退: " + cause);
        return new UserRemoteClient() {
            @Override
            public String hello() {
                return "fail";
            }
        };
    }
}
