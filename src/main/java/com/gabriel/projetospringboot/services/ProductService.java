package com.gabriel.projetospringboot.services;

import com.gabriel.projetospringboot.entities.Product;
import com.gabriel.projetospringboot.entities.User;
import com.gabriel.projetospringboot.repositories.ProductRepository;
import com.gabriel.projetospringboot.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    
    @Autowired
    private ProductRepository repository;

    public List<Product> findAll(){
        return repository.findAll();
    }

    public Product findById(Long id){
        Optional<Product> obj = repository.findById(id);
        return obj.get();
    }
}
