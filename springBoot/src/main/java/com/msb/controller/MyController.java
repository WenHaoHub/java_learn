package com.msb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {
    @RequestMapping(value="/test01",produces = "text/html;charset=utf-8")
    @ResponseBody
    public String Test01(){
        return  "hi,this is springboot";
    }


}
