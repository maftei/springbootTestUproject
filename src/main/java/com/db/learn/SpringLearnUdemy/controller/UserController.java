package com.db.learn.SpringLearnUdemy.controller;


import com.db.learn.SpringLearnUdemy.domain.Product;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;


//@Controller returns View. @RestController returns ResponseBody.
@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping ("/{userId}")
    public String displayUser(@PathVariable int userId){

        return "User Found :" + userId;
    }

        @GetMapping ("/{userId}/items")
        public List<String> displayStringJson() {
            return Arrays.asList("Shoes","laptop","button");
        }


    @GetMapping ("/{userId}/product_as_json")
    public List<Product> displayProductJson() throws Exception {
        return Arrays.asList(new Product(1,"Shjoes",25),
                new Product(2,"Shjoes",42.99),
                new Product(3,"Shjoes",45));
    }
}
