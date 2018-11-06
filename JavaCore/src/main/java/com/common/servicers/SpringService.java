package com.common.servicers;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 注入Spring服务
 * @author suhe
 * @since 2018年11月6日11:50:31
 * */
public class SpringService {
    private final static String xmlPath = "config/spring.xml";
    public static ApplicationContext applicationContext = null;

    public SpringService(){
        applicationContext = new ClassPathXmlApplicationContext(xmlPath);
    }

    public Object getBean(String beanName){
        return applicationContext.getBean(beanName);
    }
}