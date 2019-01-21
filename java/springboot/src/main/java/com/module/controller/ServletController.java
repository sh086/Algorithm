package com.module.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * SpringBoot整合Servlet
 * @author suhe
 * @since 2019年1月21日13:48:57
 * */
@WebServlet(name = "ServletController",urlPatterns = "/servlet")
public class ServletController extends HttpServlet {

    /**
     * 通过注解扫描完成Servlet组件的注册
     * */
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("helloWord");
    }
}