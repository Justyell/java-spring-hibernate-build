package com.controller;

import com.entity.User;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
public class IndexController {

    @Autowired
    UserService userService;

    @RequestMapping("/index")
    public String index(){
        return "index";
    }

    @RequestMapping("/index2")
    public String index2(){
        return "folder/index2";
    }

    @RequestMapping("insert")
    public String insert(){

        User user = new User();
        user.setName("Marry");
        user.setSex(1);

        userService.save(user);
        return "index";
    }
}
