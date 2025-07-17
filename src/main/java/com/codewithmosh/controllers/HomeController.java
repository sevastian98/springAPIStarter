package com.codewithmosh.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String index(Model model) {

        model.addAttribute("name", "Sevastian");
        System.out.println("Hello");


        return "index";
    }

}
