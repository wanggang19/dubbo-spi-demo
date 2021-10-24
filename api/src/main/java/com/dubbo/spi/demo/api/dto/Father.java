package com.dubbo.spi.demo.api.dto;

import java.io.Serializable;

/**
 * @Auther: wanggang(323492)
 * @Date: 2021/8/10 19:50
 * @Description:
 */
public class Father implements Serializable {
    private static final long serialVersionUID = 6485640031308363977L;

    private String name;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
