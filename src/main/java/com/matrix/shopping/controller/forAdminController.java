package com.matrix.shopping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class forAdminController {

    @GetMapping("/")
    public String showHome() {

        return "cart";
    }

    @GetMapping("/a")
    public String showAdminPage() {

        return "forAdmin";
    }


//    @GetMapping({"/welcome"})
//    public String welcome(Model model) {
//        return "welcome";
//    }
}
