package com.zty.service;


import org.apache.dubbo.config.annotation.DubboService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

//zookeeper :服务注册与发现

@DubboService //可以被扫描到，在项目自己启动就自己注册到注册中心
@Component //使用了Dubbo之后尽量不要使用Service注解
public class TicketServiceImpl implements TicketService
{
    @Override
    public String getTicket() {
        return "【【票】】";
    }
}
