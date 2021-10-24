package com.dubbo.spi.demo.api;

import com.dubbo.spi.demo.api.dto.Person;

/**
 * @Auther: wanggang
 * @Date: 2021/4/25 00:50
 * @Description:
 */
public interface DemoService {
    String say(Person person);
}