package com.example.Webtourism.Pagecontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RegistrationPageController {
    //Registration
    @RequestMapping("/registration")
    public String regPage(){
        return "registrationPage";
    }
}
