package com.module.action;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "UserAction",urlPatterns = "/servlet")
public class UserAction extends HttpServlet {
    /**
     * 通过注解扫描完成Servlet组件的注册
     * */
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        System.out.println("helloWord");
        super.doGet(req,resp);
    }
}
