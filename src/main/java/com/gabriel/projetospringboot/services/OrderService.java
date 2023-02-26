package com.gabriel.projetospringboot.services;

import com.gabriel.projetospringboot.entities.Order;
import com.gabriel.projetospringboot.entities.User;
import com.gabriel.projetospringboot.repositories.OrderRepository;
import com.gabriel.projetospringboot.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {
    
    @Autowired
    private OrderRepository repository;

    public List<Order> findAll(){
        return repository.findAll();
    }

    public Order findById(Long id){
        Optional<Order> obj = repository.findById(id);
        return obj.get();
    }
}
