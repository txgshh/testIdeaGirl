package com.example.girl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Value("${gril.cupSize}")
    private String cupSize;

    @Value("${gril.content}")
    private String content;

    @RequestMapping(value = "/hello",method= RequestMethod.GET)
    public String say(){
        return content;
    }

    @RequestMapping(value="/",method= RequestMethod.GET)
    public String home(){
        return "Hello World";
    }
}
