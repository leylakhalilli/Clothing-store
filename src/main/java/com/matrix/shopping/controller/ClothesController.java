package com.matrix.shopping.controller;

import com.matrix.shopping.enums.ClothesCategory;
import com.matrix.shopping.service.ClothesService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller

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

        model.addAttribute("showwomen", clothesService.getClothesWomen());
        model.addAttribute("showmen", clothesService.getClothesMen());
        model.addAttribute("showacc", clothesService.getClothesAccessories());
        return "MyPage";
    }


    @GetMapping("/product/{clothesId}/type/{clothesCategory}")
    public String product(Model model, @PathVariable Integer clothesId, ClothesCategory clothesCategory) {
        model.addAttribute("product", clothesService.findById(clothesId));
        model.addAttribute("products", clothesService.getClothesParametr());
        return "product";
    }

    @GetMapping("/contact")
    public String contact() {
        return "contact";

    }

    @GetMapping("/women")
    public String women(Model model) {
        model.addAttribute("women", clothesService.getByCategoryWomen());
        return "women";

    }

    @GetMapping("/men")
    public String men(Model model) {
        model.addAttribute("men", clothesService.getByCategoryMen());
        return "men";

    }

    @GetMapping("/accessories")
    public String accessories(Model model) {
        model.addAttribute("accessories", clothesService.getByCategoryAccessories());
        return "accessories";

    }
}
