package com.huayu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * @Auther: jmw
 * @Date: 2019/3/14 16:43
 * @Description:
 */
@Controller
@RequestMapping("/classam/classam")
public class TestController {
    @RequestMapping("/aaa.do")
    public ModelAndView aaa(){
       ModelAndView modelAndView = new ModelAndView();
       modelAndView.setViewName("/list.html");
       return modelAndView;
    }
}
