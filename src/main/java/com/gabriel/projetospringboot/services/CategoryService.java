package com.gabriel.projetospringboot.services;

import com.gabriel.projetospringboot.entities.Category;
import com.gabriel.projetospringboot.entities.User;
import com.gabriel.projetospringboot.repositories.CategoryRepository;
import com.gabriel.projetospringboot.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {
    
    @Autowired
    private CategoryRepository repository;

    public List<Category> findAll(){
        return repository.findAll();
    }

    public Category findById(Long id){
        Optional<Category> obj = repository.findById(id);
        return obj.get();
    }
}
