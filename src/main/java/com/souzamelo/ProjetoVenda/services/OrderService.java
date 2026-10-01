package com.souzamelo.ProjetoVenda.services;

import com.souzamelo.ProjetoVenda.model.entity.Order;
import com.souzamelo.ProjetoVenda.repositories.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class OrderService {


    private final OrderRepository repository;

    public List<Order> findAll() {
        return repository.findAll();
    }

    public Order findbyId(Long id) {
        Optional<Order> obj = repository.findById(id);
        return obj.get();
    }
}