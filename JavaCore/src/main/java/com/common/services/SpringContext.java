package com.common.services;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 注入Spring服务
 * @author suhe
 * @since 2018年11月6日11:50:31
 * */
public class SpringContext {
    private final static String xmlPath = "config/spring.xml";
    public static ApplicationContext applicationContext = null;

    public SpringContext(){
        applicationContext = new ClassPathXmlApplicationContext(xmlPath);
    }

    public Object getBean(String beanName){
        return applicationContext.getBean(beanName);
    }
}