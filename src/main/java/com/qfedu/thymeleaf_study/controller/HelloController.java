package com.qfedu.thymeleaf_study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *@Author feri
 *@Date Created in 2018/10/15 09:43
 */
@Controller
public class HelloController {

    @RequestMapping("/hello.do")
    public String hello(Model model){
        model.addAttribute("msg","新的一周，新的开始！");
        return "hello";
    }
    @GetMapping("hellodata.do")
    public String data(int data,Model model){
        System.err.println("data:"+data);
        model.addAttribute("msg","其他页面传输内容data="+data);
        return "hello";
    }
}
