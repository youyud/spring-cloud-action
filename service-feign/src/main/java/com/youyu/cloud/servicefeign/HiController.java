package com.youyu.cloud.servicefeign;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author qiuwu.zhong
 * @date 2020/06/19 17:28
 */
@RestController
public class HiController {
    private static final Logger LOGGER = LoggerFactory.getLogger(HiController.class);

    @Autowired
    private ScheduleServiceHi scheduleServiceHi;

    @RequestMapping(value = "/hi", method = RequestMethod.GET)
    public String sayHi() {
        LOGGER.info("feign");
        return scheduleServiceHi.sayHiFromClientOne();
    }
}
