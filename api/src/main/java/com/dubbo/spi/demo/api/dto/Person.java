package com.dubbo.spi.demo.api.dto;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * @Auther: wanggang(323492)
 * @Date: 2021/7/15 19:46
 * @Description:
 */
public class Person implements Serializable {
    private static final long serialVersionUID = -5947893181949558575L;
    private String name;
    private Integer age;
    private List<String> addresses;
    private Map<String, Integer> params;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public List<String> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<String> addresses) {
        this.addresses = addresses;
    }

    public Map<String, Integer> getParams() {
        return params;
    }

    public void setParams(Map<String, Integer> params) {
        this.params = params;
    }
}
