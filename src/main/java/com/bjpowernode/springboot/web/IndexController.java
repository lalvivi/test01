package com.bjpowernode.springboot.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {
    @Value("${school.name}")
    private String schoolName;
    @Value("${schoolAddress}")
    private String schoolAddress;
    @RequestMapping(value = "some.do")
    public @ResponseBody String DoSome(){
        return schoolAddress+schoolName;
    }
}
