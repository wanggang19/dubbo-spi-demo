package com.dubbo.spi.demo.consumer.router;

import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: wanggang(323492)
 * @Date: 2021/7/15 09:28
 * @Description:
 */
/*public class MyTagRouter extends AbstractRouter {

    public MyTagRouter(URL url) {
        this.url = url;
    }

    @Override
    public <T> List<Invoker<T>> route(List<Invoker<T>> invokers, URL url, Invocation invocation) throws RpcException {
        List<Invoker<T>> invokerList = new ArrayList<>();
        for (Invoker<T> invoker : invokers) {
            String tag = invoker.getUrl().getParameter("tag");
            if ("tag1".equals(tag)) {
                invokerList.add(invoker);
            }
        }
        return invokerList;
    }
}*/
