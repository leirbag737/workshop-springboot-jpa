package com.gabriel.projetospringboot.repositories;

import com.gabriel.projetospringboot.entities.Category;
import com.gabriel.projetospringboot.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
    
    
}
