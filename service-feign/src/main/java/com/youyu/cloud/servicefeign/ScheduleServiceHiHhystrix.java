package com.youyu.cloud.servicefeign;

import org.springframework.stereotype.Service;

/**
 * @author qiuwu.zhong
 * @date 2020/06/19 18:22
 */
@Service
public class ScheduleServiceHiHhystrix implements ScheduleServiceHi{
    @Override
    public String sayHiFromClientOne() {
        return "sorry error!";
    }
}
