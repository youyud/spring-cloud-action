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
    public String home() {
        log.info("hi is being called");
        return "hi i'm miya!";
    }

    @RequestMapping("/miya")
    public String info() {
        log.info("info is being called");
        return restTemplate.getForObject("http://localhost:8211/info", String.class);
    }
}
