package com.example.demo.dubbo.consumer.annotation;


import com.alibaba.dubbo.config.annotation.Reference;
import com.example.demo.dubbo.provider.service.annotation.ProviderServiceAnnotation;
import org.springframework.stereotype.Component;

/**
 * 注解方式的service
 */
@Component("annotatedConsumer")
public class ConsumerAnnotationService {

    @Reference
    private ProviderServiceAnnotation providerServiceAnnotation;

    public String doSayHello(String name) {
        return providerServiceAnnotation.SayHelloAnnotation(name);
    }
}