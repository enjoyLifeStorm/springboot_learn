package com.didispace.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by lifestorm on 2018/9/28.
 */
@Controller
@RequestMapping("/hello")
public class HelloController {

    @GetMapping("/world")
    @ResponseBody
    public String index(){
        return "hello world";
    }
}
