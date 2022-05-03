package com.matrix.shopping.controller;

import com.matrix.shopping.service.AboutService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AboutController {
    private AboutService aboutService;

    public AboutController(AboutService aboutService) {
        this.aboutService = aboutService;
    }
    @GetMapping("/about")
    public String title(Model model) {
        model.addAttribute("parametr", aboutService.getAboutParametr());
        return "about";

    }
}
