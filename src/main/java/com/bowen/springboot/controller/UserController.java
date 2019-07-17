package com.bowen.springboot.controller;

import com.bowen.springboot.pojo.User;
import com.bowen.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @AUTHOR zhoubo
 * @CREATE: 2019-07-17 2:07 PM
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/index")
    public String index(){
        return "user/index";
    }


    @RequestMapping("/show")
    @ResponseBody
    public String show(@RequestParam("name") String name){
        User user = userService.findUserByName(name);
        if(user != null){
            return user.getUid()+"/"+user.getName()+"/"+user.getPwd();
        }
        return "null";
    }

}
