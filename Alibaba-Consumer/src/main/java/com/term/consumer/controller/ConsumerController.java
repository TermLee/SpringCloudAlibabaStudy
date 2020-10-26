package com.term.consumer.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
public class ConsumerController {
    @Value("${server-url.nacos-service-provider}")
    private String serviceUrl;
    /*
     * @Resource和@Autowired注解都是用来实现依赖注入的。
     * 只是@AutoWried按by type自动注入，而@Resource默认按byName自动注入。
     */
    @Resource
    private RestTemplate restTemplate;

    @RequestMapping("/consumer/nacos/{id}")
    public String test(@PathVariable String id) {
        return restTemplate.getForObject(serviceUrl + "/nacos/" + id, String.class);
    }

}
