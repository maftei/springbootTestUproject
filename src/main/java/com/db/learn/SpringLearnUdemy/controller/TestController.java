package com.db.learn.SpringLearnUdemy.controller;


import com.db.learn.SpringLearnUdemy.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class TestController {

    @RequestMapping("/")
    public String login(Model model){
        model.addAttribute("formData",new User());
        return "login.html";
        // any time you are integrating with data between the @controller and the view
        // a model gets involved, every time when you want to sent data or retrieve data from web page you use the
        //Model; in the above example the "formData" is the  key and the value is the User object
        //so now to this object called "model" which is used to exchange data from the View to the Controller
        //in the html page we have to specify this formData which will have our data from the UI
        //html :  <form action="/create" method="post" th:object="${formData}">
        //section 1.11 will find  boolean,radio button:
        //https://www.udemy.com/course/spring-framework-web-development-2020/learn/lecture/16739772?start=120#announcements
    }
//    @RequestMapping(value="/create", method = RequestMethod.POST)//this method will handle the form
//    public String printUserDetails(User user){
//        return "result";
//    }
    //Above is an example on how you transfer parameters between forms
    //when you see "th:" in a html file you know that this is thymeleaf functionality
    //<input type="text" placeholder="Enter Username" th:field="${formData.username}" required>
    //this above example the  "${}"- sign -represents the value that is coming from  java

    @GetMapping("/register")
    public String register(){
        return "register.html";
    }

    //also, we have another example of redirect data, the same thing as above
    //but this time we will use redirect
    //@RequestMapping(value="/create", method = RequestMethod.POST)
    @PostMapping("/create")//this method will handle the form
    public String processUserDetails(User user, RedirectAttributes attr){
        attr.addFlashAttribute("user",user);
        return "redirect:/display";
    }

    @RequestMapping(value="/display", method=RequestMethod.GET)
    public String displayUserDetails(User user){
        return "result";
    }


}
