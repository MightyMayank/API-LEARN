package com.example.Internship_task2.Controller;

import com.example.Internship_task2.Entity.Product;
import com.example.Internship_task2.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {
    @Autowired
    private ProductService service;

    @PostMapping("/add")
    public Product add(@RequestBody Product p){
        return service.addproduct(p);
    }

    @GetMapping("/view")
    public List<Product> view(){
        return service.getAllProduct();
    }

    @DeleteMapping("/remove/{id}")
    public String delete(@PathVariable Long id){
        service.removeProduct(id);
        return "product Removed Sucessfully";
    }

    @PutMapping("/update/{id}/{qty}")
    public Product update(@PathVariable Long id,@PathVariable Integer qty){
        return service.updateQuantity(id,qty);
    }
}
