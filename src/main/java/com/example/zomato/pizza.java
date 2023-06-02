package com.example.zomato;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class pizza {

    @GetMapping("/mypizza")

    public String getData() {

        return "Zomato provide very nice pizza within 30 mins ";
    }
}
