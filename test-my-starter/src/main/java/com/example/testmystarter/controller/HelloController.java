package com.example.testmystarter.controller;

import net.biancheng.www.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @Autowired
    HelloService helloService;

    @ResponseBody
    @GetMapping("/hello")
    public String sayHello(String name){
        return helloService.sayHello(name);
    }

}
