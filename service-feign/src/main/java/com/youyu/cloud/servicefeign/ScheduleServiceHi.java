package com.youyu.cloud.servicefeign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author qiuwu.zhong
 * @date 2020/06/19 17:26
 */
@FeignClient(value = "user", fallback = ScheduleServiceHiHhystrix.class)
public interface ScheduleServiceHi {
    @GetMapping("/hello")
    String sayHiFromClientOne();
}
