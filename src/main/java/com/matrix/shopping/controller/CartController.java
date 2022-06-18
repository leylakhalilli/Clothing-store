package com.matrix.shopping.controller;

import com.matrix.shopping.dao.entity.Cart;
import com.matrix.shopping.service.ClothesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("cart")
public class CartController {
//    @Autowired
//    private ClothesService clothesService;


    @RequestMapping(method = RequestMethod.GET)
    public String index(ModelMap modelMap, HttpSession session) {
        modelMap.put("total", total(session));
        return "/cart";
    }

    @Autowired
    private ClothesService clothesService;

    private double total(HttpSession session) {
        List<Cart> carts = (List<Cart>) session.getAttribute("cart");
        double sum = 0.0;
        if (carts != null) {
            for (Cart cart : carts) {
                sum += cart.getQuantity() * cart.getClothesEntity().getClothesPrice().doubleValue();

            }
        }
        return sum;
    }

    private int isExits(int id, List<Cart> carts) {
        for (int i = 0; i < carts.size(); i++) {
            if (carts.get(i).getClothesEntity().getId() == id) {
                return i;
            }
        }
        return -1;
    }

//    @GetMapping("/cart")
//    public String cart(Model model) {
//        var productEntities = clothesService.getClothesMen();
//        return "cart";
//    }


    @RequestMapping(value = "buy/{id}", method = RequestMethod.GET)
    public String buy(@PathVariable("id") int id, ModelMap modelMap, HttpServletRequest request) {
        HttpSession session = request.getSession();

        if (session.getAttribute("cart") == null) {

            List<Cart> carts = new ArrayList<Cart>();
            carts.add(new Cart(clothesService.findById(id), 1));
            session.setAttribute("cart", carts);
        } else {
            List<Cart> carts = (List<Cart>) session.getAttribute("cart");
            int index = isExits(id, carts);
            if (index == -1) {
                carts.add(new Cart(clothesService.findById(id), 1));
            } else {
                int quantity = carts.get(index).getQuantity() + 1;
                carts.get(index).setQuantity(quantity);
            }
            session.setAttribute("cart", carts);


        }
        return "redirect:/cart";
    }

    @RequestMapping(value = "update", method = RequestMethod.POST)
    public String update(HttpServletRequest request) {
        HttpSession session = request.getSession();
        String[] quantities = request.getParameterValues("quantity");
        List<Cart> carts = (List<Cart>) session.getAttribute("cart");
        for (int i = 0; i < carts.size(); i++) {
            carts.get(i).setQuantity(Integer.parseInt(quantities[i]));
        }
        session.setAttribute("cart", carts);
        return "redirect:/cart";

    }

    @RequestMapping(value = "clear", method = RequestMethod.GET)
    public String clear(HttpServletRequest request) {
        HttpSession session = request.getSession();
        List<Cart> carts = (List<Cart>) session.getAttribute("cart");
        carts.clear();
        session.setAttribute("cart", carts);
        return "redirect:/cart";

    }

    @RequestMapping(value = "remove/{id}", method = RequestMethod.GET)
    public String remove(@PathVariable("id") int id, HttpServletRequest request) {

        HttpSession session = request.getSession();
        List<Cart> carts = (List<Cart>) session.getAttribute("cart");
        int index = isExits(id, carts);
        carts.remove(index);
        session.setAttribute("cart", carts);
        return "redirect:/cart";

    }

//    @RequestMapping(value = "checkout", method = RequestMethod.GET)
//    public String checkout(HttpSession session) {
//        if (session.getAttribute("username") == null) {
//            return "redirect:/login";
//        } else {
//            return "redirect:/cart";
//        }
//    }


}
