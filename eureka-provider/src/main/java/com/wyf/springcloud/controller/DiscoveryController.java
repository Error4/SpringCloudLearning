package com.wyf.springcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DiscoveryController {
    @Autowired
    private DiscoveryClient client;

    @GetMapping("/getService")
    public Object discovery(){
        //获取所有微服务的列表
        List<String> services = client.getServices();
        //根据serviceId（即指定的applicationName）获取对应服务
        List<ServiceInstance> provider = client.getInstances("eureka-provider");
        ServiceInstance serviceInstance = provider.get(0);
        return serviceInstance.getHost() +"-"+
                serviceInstance.getServiceId()+"-"+
                serviceInstance.getPort();
    }
}
