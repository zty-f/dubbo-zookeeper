package com.zty.service;

import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.stereotype.Service;

@Service  //放到spring容器中
public class UserService {
    //想拿到provider-server提供的票   即去注册中心拿取票的服务
    @DubboReference //引用服务注解   1.pom坐标   2.可以定义路径相同的接口名
    TicketService ticketService;

    public void buyTickets(){
        String ticket = ticketService.getTicket();
        System.out.println("从注册中心得到 ： "+ticket);
    }

}
