package com.shidili.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    @RequestMapping("/test")
    public void delProject() {
        System.out.println("3334");
    }
}
