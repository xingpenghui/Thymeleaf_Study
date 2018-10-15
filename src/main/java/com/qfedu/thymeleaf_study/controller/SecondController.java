package com.qfedu.thymeleaf_study.controller;

import com.qfedu.thymeleaf_study.pojo.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

/**
 *@Author feri
 *@Date Created in 2018/10/15 10:05
 */
@Controller
public class SecondController {

//    int a;
//    a=10;
//    System.out.println("OK");
    @RequestMapping("/second.do")
    public String second(Model model, HttpSession session){
        //为页面准备数据
        model.addAttribute("lname","用户名");
        model.addAttribute("name","张三");
        model.addAttribute("id","1");
        //创建对象
        Student student=new Student();
        student.setSid(1001);
        student.setSname("李四");
        //存储到HttpSession中
        session.setAttribute("stu",student);
        List<Student> list=new ArrayList<Student>();

        for(int i=0;i<10;i++){
            Student student1=new Student();
            student1.setSid(i+100);
            student1.setSname("赢天"+i);
            list.add(student1);
        }
        model.addAttribute("stus",list);

////        System.out.println(i);
////        Student stu1=new Student();
////        System.out.println(stu+stu1);
        return "second";
    }
}
