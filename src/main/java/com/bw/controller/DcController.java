package com.bw.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by lenovo on 2017/7/21.
 */
@RestController
public class DcController {
    @Autowired
    DiscoveryClient discoveryClient;

    /**
     * 客户端,可以获取服务端的信息
     * 注意:
     *
     *
     * @return
     */
    @GetMapping("/dc")
    public String dc(){
        String services = "Services: " + discoveryClient.getServices();
        System.out.println(services);
        return services;
    }

}
