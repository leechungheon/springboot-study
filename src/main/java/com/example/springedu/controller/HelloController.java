package com.example.springedu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
    @GetMapping("/hello")
    public String hello(Model model){
        System.out.println("첫 번째 스프링 부트 테스트~~~~@@");
        model.addAttribute("data", "String Boot");
        return "helloView"; // view 이름만 적으면 spring 프레임워크가 알아서 매핑
    }
}
