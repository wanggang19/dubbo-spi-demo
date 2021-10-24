package com.dubbo.spi.demo.provider;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ProviderTest {

    @Test
    public void start_provider_1() throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"dubbo-provider.xml"});
        context.start();
        System.out.println("Dubbo Provider 1 started successfully...");
        System.in.read();
    }

    @Test
    public void start_provider_2() throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"dubbo-provider2.xml"});
        context.start();
        System.out.println("Dubbo Provider 2 started successfully...");
        System.in.read();
    }

    /*@Test
    public void start_provider_3() {
        URL registryUrl = URL.valueOf("zookeeper://127.0.0.1:2181");
        ZookeeperRegistryFactory zookeeperRegistryFactory = new
                ZookeeperRegistryFactory();
        zookeeperRegistryFactory.setZookeeperTransporter(new
                CuratorZookeeperTransporter());
        Registry zookeeperRegistry = zookeeperRegistryFactory.createRegistry(registryUrl);
        URL routerURL =
                URL.valueOf("script://0.0.0.0/com.alibaba.dubbo.demo.DemoService?category=routers&dynamic=false&enabled=true&force=false&name=demoService_createUser_router&priority=0&runtime=true");
        routerURL = routerURL.addParameter("rule",
                URL.encode(get_demoService_createUser_router()));
        zookeeperRegistry.register(routerURL);     // 注册
        // zookeeperRegistry.unregister(routerURL); // 取消注册
    }*/
}
