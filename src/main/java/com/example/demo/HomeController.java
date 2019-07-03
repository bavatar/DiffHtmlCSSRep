package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/index")
    public String homePage(){
        return "index";
    }
    // comment the same way you did other java files

    @RequestMapping("/index2")
    public String classPage(){
        return "index2";
    }

}
