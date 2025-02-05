package com.example.springsecurity2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DemoController {
    @GetMapping("/")
    public String index() {
        return "index";
    }
    @GetMapping("/user")
    public String user() {
        return "user";
    }
    @GetMapping("/admin")
    public String admin() {
        return "admin";
    }

    @GetMapping("accessDenied")
    public String accessDenied() {
        return "accessDenied";
    }
}