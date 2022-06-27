package com.matrix.shopping.controller;

import com.matrix.shopping.dao.entity.ClothesEntity;
import com.matrix.shopping.service.ClothesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/admin")
public class AdminPageController {
    private ClothesService clothesService;

    @Autowired
    public AdminPageController(ClothesService clothesService) {
        this.clothesService = clothesService;
    }


    @GetMapping({"", "/"})
    public String findAll(Model model) {
        List<ClothesEntity> clothesEntityList = clothesService.findAll();
        model.addAttribute("product", clothesEntityList);
        return "adminPage";
    }

    @GetMapping("/addproduct")
    public String addProduct() {
        return "addProduct";
    }

    @GetMapping("/editProduct/{id}")
    public String editProduct(@PathVariable Integer id, Model model) {
        ClothesEntity clothesEntity = clothesService.getClothesParametr(id);
        model.addAttribute("product", clothesEntity);

        return "editProduct";
    }

    @GetMapping("/saveProduct")
    public String saveProduct(ClothesEntity clothesEntity) {
        clothesService.saveProduct(clothesEntity);
        return "redirect:/admin";

    }

    @GetMapping("/deleteProduct/{id}")
    public String deleteProduct(@PathVariable Integer id) {
        clothesService.deleteProduct(id);
        return "redirect:/admin";
    }


}
