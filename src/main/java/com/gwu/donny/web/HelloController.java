package com.gwu.donny.web;

import com.gwu.donny.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

    @Autowired
    private UserService userService;

    @RequestMapping("/")
    public String index(ModelMap map){
        map.addAttribute("host", userService.getUserInfo());
        return "index";
    }
}
