package com.youyu.cloud.user.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author zhongqiuwu
 * @desciption
 * @date 2020/06/21 23:35
 */
@RestController
public class ZipkinTestController {
    private static final Logger LOGGER = LoggerFactory.getLogger(ZipkinTestController.class);

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/hi")
    public String callHome() {
        LOGGER.info("calling trace user  ");
        return restTemplate.getForObject("http://localhost:8212/miya", String.class);
    }

    @RequestMapping("/info")
    public String info() {
        LOGGER.info("calling trace user ");
        return "i'm user";
    }
}
