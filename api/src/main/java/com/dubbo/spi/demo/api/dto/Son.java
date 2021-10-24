package com.dubbo.spi.demo.api.dto;

/**
 * @Auther: wanggang(323492)
 * @Date: 2021/8/10 19:51
 * @Description:
 */
public class Son extends Father {
    private static final long serialVersionUID = 2093831318380148595L;

    private String name;
    private String address;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}
