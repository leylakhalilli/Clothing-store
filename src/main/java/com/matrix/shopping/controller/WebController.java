package com.matrix.shopping.controller;

import com.matrix.shopping.dao.entity.ProductEntity;
import com.matrix.shopping.service.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
//@RequestMapping("/shopping")
public class WebController {
//    @Autowired
    MainService mainService;

    public WebController(MainService mainService) {
        this.mainService = mainService;
    }

//    @GetMapping("/home")
//    public String home(Model model) {
////        List<ProductEntity> productEntityList = mainService.getProducts();
////        model.addAttribute("products", productEntityList);
//        return "home";
//    }

//    @GetMapping("/mypage")
//    public String page(Model model) {
//        var productEntities = mainService.getProducts();
//        return "MyPage";
//
//    }
//    @GetMapping("/women")
//    public String women(Model model) {
//        var productEntities = mainService.getProducts();
//        return "women";
//    }
//    @GetMapping("/men")
//    public String men(Model model) {
//        var productEntities = mainService.getProducts();
//        return "men";
//    }
//    @GetMapping("/accessories")
//    public String accessories(Model model) {
//        var productEntities = mainService.getProducts();
//        return "accessories";
//    }
//    @GetMapping("/product")
//    public String product(Model model) {
//        var productEntities = mainService.getProducts();
//        return "product";
//    }
//    @GetMapping("/about")
//    public String about(Model model) {
//        var productEntities = mainService.getProducts();
//        return "about";
//    }

//    @GetMapping("/login")
//    public String login(Model model) {
//        var productEntities = mainService.getProducts();
//        return "login";
//    }
//    @GetMapping("/registration")
//    public String registration(Model model) {
//        var productEntities = mainService.getProducts();
//        return "registration";
//    }

    @GetMapping("/home/product-detail")
    public String homeProductDetail(Model model) {
//        var productDetails = mainService.getDetailsEntity();
//        model.addAttribute("pr", productDetails);
        var details=mainService.getProducts();
        model.addAttribute("product",details);
        return "product-details";

    }
}
