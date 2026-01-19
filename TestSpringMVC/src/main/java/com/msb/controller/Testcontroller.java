package com.msb.controller;

import com.msb.pojo.Person;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Testcontroller {
    @RequestMapping("/test")
    public String test(){
        return "index.jsp";
    }
    @RequestMapping("/testParam")
    public String testParam(String name,int age){
    //启动tomcat查看控制台接收参数
        System.out.println("name:"+name+",age:"+age);
        return "index.jsp";
    }
    @RequestMapping("/testPerson")
    public String testPerson(Person P){
        System.out.println("name:"+P.getName()+",age:"+P.getAge());
        return "index.jsp";
    }
}
