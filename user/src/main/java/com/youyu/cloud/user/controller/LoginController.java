package com.youyu.cloud.user.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhongqiuwu
 * @desciption
 * @date 2019/01/28 10:40
 */
@Slf4j
@RestController
public class LoginController {


    @GetMapping("/hello")
    public String test(){

        return "hello word";
    }


}
