package com.example.Internship_task2.repository;

import com.example.Internship_task2.Entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {
}
