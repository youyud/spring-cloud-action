package com.youyu.cloud.ribbonconsumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author zhongqiuwu
 * @desciption
 * @date 2019/01/28 17:07
 */
@RestController
public class ConsumerController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/ribbonConsumer")
    public String helloConsumer(){
        return restTemplate.getForEntity("http://user/hello",String.class).getBody();
    }
}
