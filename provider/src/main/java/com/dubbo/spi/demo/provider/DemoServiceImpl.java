package com.dubbo.spi.demo.provider;

import com.dubbo.spi.demo.api.DemoService;
import com.dubbo.spi.demo.api.dto.Person;
import org.apache.dubbo.config.annotation.Service;

/**
 * @Auther: wanggang(323492)
 * @Date: 2021/4/25 00:50
 * @Description:
 */
//@Service
public class DemoServiceImpl implements DemoService {
    @Override
    public String say(Person person) {
        return "success";
    }
}
