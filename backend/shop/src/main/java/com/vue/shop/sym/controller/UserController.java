package com.vue.shop.sym.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
public class UserController{

    @RequestMapping("/getSignUpData")
    public int getMainData(){
        return 1;
    }

}