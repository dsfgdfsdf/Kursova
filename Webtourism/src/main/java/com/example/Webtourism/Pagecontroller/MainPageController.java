package com.example.Webtourism.Pagecontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainPageController {
    //Main page
    @RequestMapping("/")
    public String MainPage(){
        return "MainPage";
    }
}
