package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;




@Controller
public class rcontroller {

    @GetMapping("/vanako")
    public String vanako(){
        return "vanako";
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }
    
}
