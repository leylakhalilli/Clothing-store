package com.matrix.shopping.controller;

import com.matrix.shopping.service.ClothesService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
//@RequestMapping("/")

public class ClothesController {
    private ClothesService clothesService;

    public ClothesController(ClothesService clothesService) {
        this.clothesService = clothesService;
    }

    @GetMapping("/home")
    public String home(Model model) {
        model.addAttribute("womenparametr", clothesService.getByCategoryWomen());
        model.addAttribute("menparametr", clothesService.getByCategoryMen());
        model.addAttribute("accparametr", clothesService.getByCategoryAccessories());
        model.addAttribute("allparametr", clothesService.getClothesParametr());
        return "MyPage";
    }

    @GetMapping("/product/{clothesId}/type/{clothesCategory}")
    public String product(Model model, @PathVariable Integer clothesId, String clothesCategory) {
        model.addAttribute("product", clothesService.findById(clothesId));
        model.addAttribute("products", clothesService.getClothesParametr());
        return "product";
    }

    @GetMapping("/contact")
    public String contact() {
        return "contact";

    }
}
