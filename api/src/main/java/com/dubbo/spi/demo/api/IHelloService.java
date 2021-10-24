package com.dubbo.spi.demo.api;

import com.dubbo.spi.demo.api.dto.Son;

public interface IHelloService {
    String hello(Son son, String id);

    String say(String name);
}
