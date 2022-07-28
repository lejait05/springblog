package com.example.codeup.springblog.controller;

import com.example.codeup.springblog.model.Product;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class ProductController {
    ProductRepository

    @GetMapping("/products")
    public String showAllProducts(Model model){
       List<Product> productList = new ArrayList<>(Arrays.asList(
               new Product("Hammer",1000),
               new Product("Broom", 2000),
               new Product("Mop", 500)
       ));
       model.addAttribute("products",productList);
return "products/index";
    }
}
