package com.matrix.shopping.controller;

import com.matrix.shopping.dao.entity.ProductEntity;
import com.matrix.shopping.model.Product;
import com.matrix.shopping.service.MainService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/main")
public class MainController {
    private MainService mainService;

    public MainController(MainService mainService) {
        this.mainService = mainService;
    }

    @GetMapping("/get-products")
    public List<ProductEntity> getProducts() {
        List<ProductEntity> productList = mainService.getProducts();
        return productList;
    }

    @GetMapping("/get-products/{name}/id/{id}")
    public ProductEntity getProduct(@PathVariable String name, @PathVariable Integer id) {
        return mainService.getProductByNameAndById(name, id);
    }

//    @GetMapping("get-product/{name}")
//    public ProductEntity getProductByName(@PathVariable String name) {
//        return mainService.getProductByName(name);
//    }

    @GetMapping("/hello")
    public void sayHello() {
        System.out.println("hi Leyla");
    }

    @PostMapping("/product-save")
    public String saveProduct(@RequestBody ProductEntity product) {
        System.out.println(product.getName());
        return "";
    }
    @GetMapping("/product/id/{id}")
    public  Product getProductById(@PathVariable Integer id){
        return  mainService.getProductById(id);
    }







//
//    @PostMapping("/edit")
//    public void edit(@RequestBody Product product) {
//        System.out.println(product);
//    }
//
//    @PostMapping("/delete")
//    public void delete(@RequestBody Product product) {
//        System.out.println(product);
//    }


}
