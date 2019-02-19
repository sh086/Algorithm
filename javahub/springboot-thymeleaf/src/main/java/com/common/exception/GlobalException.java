package com.common.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class GlobalException {

    @ExceptionHandler(value = {java.lang.NullPointerException.class})
    public ModelAndView nullPointerException(Exception e){
        ModelAndView mv = new ModelAndView();
        mv.addObject("exception",e.toString());
        mv.setViewName("error");
        return mv;
    }
}
