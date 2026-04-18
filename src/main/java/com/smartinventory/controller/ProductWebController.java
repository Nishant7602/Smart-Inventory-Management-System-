package com.smartinventory.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.smartinventory.entity.Product;
import com.smartinventory.service.ProductService;

@Controller
@RequestMapping("/product")
public class ProductWebController {

    @Autowired
    private ProductService productService;

    // Show all products
    @GetMapping("/list")
    public String listProducts(Model model) {

        List<Product> products = productService.getAllProducts();

        model.addAttribute("products", products);

        return "product-list";
    }
    
    @RequestMapping("/warehouse")
    public class WarehouseController {

        @GetMapping("/add")
        public String showAddForm() {
            return "add-warehouse";
        }
    }
    // Show add product form
    @GetMapping("/addProduct")
    public String showAddForm(Model model) {

        Product product = new Product();

        model.addAttribute("product", product);

        return "add-product";
    }

    // Save product
    @PostMapping("/saveProduct")
    public String saveProduct(@ModelAttribute("product") Product product) {

        productService.saveProduct(product);

        return "redirect:/product/list";
    }
    @GetMapping("/delete/{id}")
    public String deleteProduct(@PathVariable("id") Long id) {
        productService.deleteProduct(id);
        return "redirect:/product/list";
    }


    // Show edit form
    @GetMapping("/edit")
    public String editProduct(@RequestParam("id") int id, Model model) {

        Product product = productService.getProductById(id);

        model.addAttribute("product", product);

        return "product-form";
    }

    // Delete product
    @GetMapping("/delete")
    public String deleteProduct(@RequestParam("id") long id) {

        productService.deleteProduct(id);

        return "redirect:/product/list";
    }
}