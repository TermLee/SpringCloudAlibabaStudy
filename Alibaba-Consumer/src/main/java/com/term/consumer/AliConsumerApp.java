package com.term.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class AliConsumerApp {
    public static void main(String[] args) {
        SpringApplication.run(AliConsumerApp.class, args);
    }
}
