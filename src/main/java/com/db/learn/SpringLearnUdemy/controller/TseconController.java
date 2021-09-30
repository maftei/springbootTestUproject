package com.db.learn.SpringLearnUdemy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller //Controller
public class TseconController {

    //aici avem un exemplu in care daca folosim @Controller avem nevoie de pagini html
    //pe care sa le returneze, daca folosim @RestController returneaza direct continutul din http
    //in cazul de mai jos va returna exact register.html intr-o paginna web
    //si mai avem situatia in care putem folosi @Controller +@ResponseBody si avem un comportament ca pt @Restontroller


//    @RequestMapping("/test")
//    public String saysomething(){
//        return "register.html";
//    }
    @GetMapping("/test")
    public String register(){
        return "register.html";
    }
}
