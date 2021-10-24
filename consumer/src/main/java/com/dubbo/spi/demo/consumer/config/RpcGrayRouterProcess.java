package com.dubbo.spi.demo.consumer.config;

/*import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.ApplicationConfig;
import org.apache.dubbo.config.ReferenceConfig;
import org.apache.dubbo.config.ReferenceConfigBase;
import org.apache.dubbo.config.RegistryConfig;
import org.apache.dubbo.config.spring.ReferenceBean;
import org.apache.dubbo.config.spring.beans.factory.annotation.ReferenceAnnotationBeanPostProcessor;
import org.apache.dubbo.rpc.model.ServiceMetadata;
import org.apache.dubbo.spring.boot.autoconfigure.DubboAutoConfiguration;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.InjectionMetadata;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.annotation.AnnotationAttributes;
import org.springframework.stereotype.Component;*/

import java.util.HashMap;
import java.util.Map;

/**
 * @Auther: wanggang(323492)
 * @Date: 2021/7/21 10:10
 * @Description:
 */
//@Component
//@Slf4j
/*public class RpcGrayRouterProcess implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        log.info("beanName before:{}", beanName);
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        log.info("beanName:{}", beanName);
        if (bean instanceof ApplicationConfig) {
            ApplicationConfig applicationConfig = (ApplicationConfig) bean;
            Map<String, String> map = new HashMap<>();
            map.put("group", "A");
            applicationConfig.setParameters(map);
        } else if (bean instanceof RegistryConfig) {
            RegistryConfig referenceBean = (RegistryConfig) bean;
            referenceBean.setGroup("A");
        }
        return bean;
    }
}*/
