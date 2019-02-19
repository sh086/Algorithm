package com.common.context;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import javax.servlet.http.HttpServletRequest;

/**
 * 域对象处理
 * */
@Controller
public class HttpContextConfig {

    @GetMapping("/getHttpContext")
    public String httpContext(HttpServletRequest request){
        request.setAttribute("req","HttpServletRequest");
        request.getSession().setAttribute("session","Session");
        request.getSession().getServletContext().setAttribute("app","Application");
        return "context";
    }
}
