package com.bowen.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @AUTHOR zhoubo
 * @CREATE: 2019-07-17 1:28 PM
 */
@Controller
public class HelloWorldController {

    @RequestMapping("/say.html")
    @ResponseBody
    public String say(){
        return "HelloSpringBoot";
    }
}
