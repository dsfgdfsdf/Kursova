package com.example.Webtourism.Pagecontroller;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AuthPageController {

    //login form
    @RequestMapping("/auth")
    public String authPage(){
        return "AuthPage";
    }




}