package com.genckaya.courseapi.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String sayHello() {
        return "Hi!";
    }

    @RequestMapping("/thanks")
    public String sayThanks(){ return "Thanks for visit our website!";}
}
