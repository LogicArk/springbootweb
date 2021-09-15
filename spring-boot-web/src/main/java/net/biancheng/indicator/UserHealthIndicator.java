package net.biancheng.indicator;

import org.springframework.boot.actuate.health.AbstractHealthIndicator;
import org.springframework.boot.actuate.health.Health;
import org.springframework.stereotype.Component;

/**
 * @Author: LogicArk
 * @Description: 在很多场景下，我们需要自定义一些规则来判断应用的状态是否健康，可以采用自定义端点的方式来满足多样性的需求。如果我们只是需要对应用的健康状态增加一些其他维度的数据，可以通过继承 AbstractHealthIndicator 来实现自己的业务逻辑
 * @Date: Created in 2021/8/17 13:08
 */
@Component
public class UserHealthIndicator extends AbstractHealthIndicator {

    /**
     * 项目启动完毕后，访问 http://localhost:8080/actuator/health 查看效果
     * @param builder
     * @throws Exception
     */
    @Override
    protected void doHealthCheck(Health.Builder builder) throws Exception {
        builder.up().withDetail("status",true);
//        builder.down().withDetail("status",false);
    }

}
