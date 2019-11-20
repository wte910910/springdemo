package com.wte.leaning.work.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class MainController {
    @RequestMapping("/list")
    public String list(){
        return "list";
    }
}
