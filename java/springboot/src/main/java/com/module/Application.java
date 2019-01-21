package com.module;

import com.module.controller.ServletAction;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;

/**
 * SpringBoot启动类
 * @author suhe
 * @since 2019年1月21日13:04:53
 * */
@SpringBootApplication
//@ServletComponentScan
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Bean
    public ServletRegistrationBean getServlet(){
        ServletRegistrationBean bean = new ServletRegistrationBean(new ServletAction(),"");
        bean.addUrlMappings("/second");
        return bean;
    }
}

