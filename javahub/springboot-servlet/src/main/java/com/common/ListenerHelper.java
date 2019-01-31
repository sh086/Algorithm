package com.common;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class ListenerHelper implements ServletContextListener {
    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("Listener已成功关闭");
    }
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("Listener初始化已完成");
    }
}

