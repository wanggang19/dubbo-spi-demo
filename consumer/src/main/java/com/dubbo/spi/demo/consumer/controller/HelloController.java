package com.dubbo.spi.demo.consumer.controller;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.dubbo.rpc.RpcContext;
import com.alibaba.dubbo.rpc.service.GenericService;
import com.alibaba.fastjson.JSON;
import com.dubbo.spi.demo.api.dto.Person;
import com.qccr.knife.result.Result;
import com.qccr.superopenapi.facade.ro.spi.SPIMessageRo;
import com.qccr.superopenapi.facade.service.spi.SPIFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

@RestController
public class HelloController {

//    @Resource
//    private IHelloService helloService;

//    @Resource
//    private DemoService demoService;

    @Resource
    private ApplicationConfig applicationConfig;

/*    @Reference(version = "1.0.0", timeout = 3000, retries = 1)
    private CarzoneItemFacade carzoneItemFacade;*/

    @Autowired
    private ApplicationContext applicationContext;

    @Reference(version = "1.0.1")
    private SPIFacade spiFacade;

    @RequestMapping(value = "/hello")
    public String hello() {
        System.out.println(applicationConfig.getName());
//        return helloService.hello("tom");
        GenericService helloService = (GenericService) applicationContext.getBean("helloService");
        /*Son son = new Son();
        son.setName("wg");
        son.setAddress("asdfsa");*/
        Map<String, String> map = new HashMap<>();
        map.put("name", "wg");
        Object result = helloService.$invoke("hello", new String[]{"com.dubbo.spi.demo.api.dto.Son", "java.lang.String"}, new Object[]{map, "adsf"});
        RpcContext.getContext().setAttachment("name", "asdf");
//        String result = helloService.hello("world ");
        System.out.println(result.toString());
        return result.toString();
    }

    @RequestMapping(value = "/hello1")
    public String hello1() {
        System.out.println(applicationConfig.getName());
//        return helloService.hello("tom");
        GenericService helloService = (GenericService) applicationContext.getBean("helloService");
        /*Son son = new Son();
        son.setName("wg");
        son.setAddress("asdfsa");*/
        Map<String, String> map = new HashMap<>();
        map.put("address", "asdf");
        Object result = helloService.$invoke("hello", new String[]{"com.dubbo.spi.demo.api.dto.Son", "java.lang.String"}, new Object[]{map, "adsf"});
        RpcContext.getContext().setAttachment("name", "asdf");
//        String result = helloService.hello("world ");
        System.out.println(result.toString());
        return result.toString();
    }

//    @RequestMapping("/say")
//    public String say() {
//        return demoService.say("hello");
//    }

    @RequestMapping("/testMap")
    public Result<String> testMap(String name) {
        SPIMessageRo spiMessageRo = new SPIMessageRo();
        spiMessageRo.setAppKey("20210609105");
        spiMessageRo.setMessageId("1");
        spiMessageRo.setSpiName("com.nopadmin.spi.test");
        Map<String, String> map = new HashMap<>();
        map.put("name", "adf");
        spiMessageRo.setParam(map);
        return spiFacade.syncInvoke(spiMessageRo);
    }

    @RequestMapping("/testJson")
    public Result<String> testJson(@RequestBody Person person) {
        SPIMessageRo spiMessageRo = new SPIMessageRo();
        //新
//        spiMessageRo.setAppKey("20210609105");
        //旧
        spiMessageRo.setAppKey("2017020785");
        spiMessageRo.setMessageId("1");
        spiMessageRo.setSpiName("com.nopadmin.spi.test");
        spiMessageRo.setBody(JSON.toJSONString(person));
        return spiFacade.syncInvoke(spiMessageRo);
    }

    /*@RequestMapping("/testItem")
    public String testItem() {
        RequestCarzoneFilterDto request = new RequestCarzoneFilterDto();
        request.setCityId(1);
        try {
            Result<List<ResponseCarzoneFilterDto>> result = carzoneItemFacade.filterItems(request);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "success";
    }*/

}
