package com.example.Internship_task2.service;

import com.example.Internship_task2.Entity.Product;
import com.example.Internship_task2.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    public Product addproduct(Product product){
        return repository.save(product);
    }

    public List<Product> getAllProduct(){
        return repository.findAll();
    }

    public void removeProduct(Long id){
        repository.deleteById(id);
    }

    public Product updateQuantity(Long id,Integer newQuantity){
        Product p=repository.findById(id).orElseThrow();
        p.setQuantity(newQuantity);
        return repository.save(p);
    }
}
