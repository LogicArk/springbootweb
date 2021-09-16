package net.biancheng.eurekaserver.listener;

import com.netflix.appinfo.InstanceInfo;
import org.springframework.cloud.netflix.eureka.server.event.*;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class EurekaStateChangeListener {

    /**
     * 服务下线事件
     * @param event
     */
    @EventListener
    public void listen(EurekaInstanceCanceledEvent event){
        System.err.println(event.getServerId() + "\t" + event.getAppName() + " 服务下线");
    }

    /**
     * 服务注册事件
     * @param event
     */
    @EventListener
    public void listen(EurekaInstanceRegisteredEvent event){
        InstanceInfo instanceInfo = event.getInstanceInfo();
        System.err.println(instanceInfo.getAppName() + " 进行注册 ");
    }

    /**
     * 服务续约事件
     * @param event
     */
    @EventListener
    public void listen(EurekaInstanceRenewedEvent event){
        System.err.println(event.getServerId() + "\t" + event.getAppName() + " 服务进行续约 ");
    }

    /**
     * 注册中心启动事件
     * @param event
     */
    @EventListener
    public void listen(EurekaRegistryAvailableEvent event){
        System.err.println(" 注册中心启动 ");
    }

    /**
     * Eureka Server 启动事件
     * @param event
     */
    @EventListener
    public void listen(EurekaServerStartedEvent event){
        System.err.println(" Eureka Server启动 ");
    }
}
