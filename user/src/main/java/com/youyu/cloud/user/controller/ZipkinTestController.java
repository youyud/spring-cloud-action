package com.youyu.cloud.user.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author zhongqiuwu
 * @desciption
 * @date 2020/06/21 23:35
 */
@Slf4j
@RestController
public class ZipkinTestController {
    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/hi")
    public String callHome() {
        log.info("calling trace user  ");
        return restTemplate.getForObject("http://localhost:8212/miya", String.class);
    }

    @RequestMapping("/info")
    public String info() {
        log.info("calling trace user ");
        return "i'm user";
    }
}
