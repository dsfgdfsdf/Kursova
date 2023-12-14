package com.example.Webtourism.Pagecontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class InfoUserPageController {
    //Information for User
    @RequestMapping("/info")
    public String infoUserPage(){
        return "infoUserPage";
    }
}
