package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    // has the updated css and bootstrap information
    @RequestMapping("/")
    public String classPage(){
        return "class";
    }

    // does not have updates
    @RequestMapping("/original")
    public String homePage(){
        return "original";
    }


}
