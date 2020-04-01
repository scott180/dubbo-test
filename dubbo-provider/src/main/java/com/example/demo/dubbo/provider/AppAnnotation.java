package com.example.demo.dubbo.provider;


import com.alibaba.dubbo.config.spring.context.annotation.DubboComponentScan;
import com.example.demo.dubbo.provider.configuration.DubboConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import sun.applet.Main;

import java.io.IOException;

/**
 * 注解启动方式
 */
public class AppAnnotation {

    public static void main(String[] args) throws IOException {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DubboConfiguration.class);
        context.start();
        System.in.read();
    }
}