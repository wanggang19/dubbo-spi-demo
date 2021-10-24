package com.dubbo.spi.demo.provider;

import com.dubbo.spi.demo.api.IHelloService;
import com.dubbo.spi.demo.api.dto.Son;
import org.apache.dubbo.rpc.RpcContext;

public class HelloService implements IHelloService {
    public String hello(Son son, String id) {
        RpcContext.getContext().getAttachment("name");
//        System.out.println(new Gson().toJson(son));
        return "hello " + son.getName();
    }

    @Override
    public String say(String name) {
        return name;
    }
}