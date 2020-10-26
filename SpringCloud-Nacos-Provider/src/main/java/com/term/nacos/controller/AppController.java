package com.term.nacos.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {
    @Value("${server.port}")
    private String port;

    @RequestMapping("/nacos/{id}")
    public String getPort(@PathVariable String id) {
        return "ServerProvider, serverPort:" + port + "\t id:" + id;
    }
}
