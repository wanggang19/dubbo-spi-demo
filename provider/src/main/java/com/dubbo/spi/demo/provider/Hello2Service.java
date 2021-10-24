package com.dubbo.spi.demo.provider;

import com.dubbo.spi.demo.api.IHelloService;
import com.dubbo.spi.demo.api.dto.Person;
import com.dubbo.spi.demo.api.dto.Son;

/**
 * @Auther: wanggang(323492)
 * @Date: 2021/1/13 23:25
 * @Description:
 */
public class Hello2Service implements IHelloService {
    @Override
    public String hello(Son son, String id) {
        return "OK";
    }

    @Override
    public String say(String name) {
        return name;
    }
}
