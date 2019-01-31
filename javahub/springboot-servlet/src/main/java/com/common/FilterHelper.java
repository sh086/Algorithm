package com.common;

import lombok.extern.slf4j.Slf4j;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter(filterName = "FilterHelper" ,urlPatterns = {"*.do","*.action"})
@Slf4j
public class FilterHelper implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest,
                         ServletResponse servletResponse, FilterChain filterChain)
            throws IOException, ServletException {
        filterChain.doFilter(servletRequest,servletResponse);
        log.info("拦截器已经拦截成功！");
    }
}