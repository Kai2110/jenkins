package cn.com.kai9527.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HellloController {

    @GetMapping("/hello")
    public String helloWorld(){
        return "hello jenkins";
    }

}
