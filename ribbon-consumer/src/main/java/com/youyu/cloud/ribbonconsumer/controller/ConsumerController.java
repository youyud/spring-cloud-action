package com.youyu.cloud.ribbonconsumer.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
    private static final Logger LOGGER = LoggerFactory.getLogger(ConsumerController.class);

    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "hiError")
    @GetMapping("/hi")
    public String helloConsumer() {
        LOGGER.info("helloConsumer");
        return restTemplate.getForEntity("http://user/hello", String.class).getBody();
    }

    public String hiError() {
        return "hi," + "sorry,error!";
    }
}
