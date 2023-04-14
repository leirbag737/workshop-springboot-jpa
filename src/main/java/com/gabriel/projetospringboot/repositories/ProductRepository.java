package com.gabriel.projetospringboot.repositories;

import com.gabriel.projetospringboot.entities.Category;
import com.gabriel.projetospringboot.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
    
    
}
