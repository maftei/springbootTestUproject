package com.db.learn.SpringLearnUdemy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


//@Controller returns View. @RestController returns ResponseBody
@Controller
@RequestMapping("/greeting")
public class SayHello {

    @GetMapping("/basic")
    @ResponseBody
    public String syaHello() {
        return "Helloo!";
    }

    @GetMapping("/proper")
    public String sayGo() {
        return "GOOOOOOO";
    }

//    @RequestMapping("/user_entry")
//        public String userForm() {
//        return " <form action=\"/user_greeting\" method=\"POST\">\n" +
//                " First name:<br>\n" +
//                " input type=\"text\"  name=\"firstname\">\n" +
//                " <br>\n" +
//                " Last name:<br>\n" +
//                " input type=\"text\"  name=\"firstname\">\n" +
//                " <br><br>\n" +
//                " input type =\"submit\" value =\"Submit\">\n" +
//                " </form > ";
//    }






//    @RequestMapping(value="/user_greeting", method =RequestMethod.GET)
//    @ResponseBody
//    public String printUserDetails(@RequestParam String uname,
//                                   @RequestParam String psw){
//        return   uname;
//    }

    @GetMapping("/")
    public String login(){
        return "login";
    }




}
