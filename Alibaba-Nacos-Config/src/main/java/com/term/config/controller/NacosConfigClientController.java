package com.term.config.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope //支持nacos动态刷新
public class NacosConfigClientController {
    @Value("${config.info}")
    private String info;

    @RequestMapping("/info")
    public String getInfo() {
        return info;
    }
}
