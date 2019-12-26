package com.gec.demo.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    @RequestMapping("/doTest")
    public String doTest(){
        return "Hello";
    }
}
