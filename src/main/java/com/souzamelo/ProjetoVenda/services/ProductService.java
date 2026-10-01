package com.souzamelo.ProjetoVenda.services;
import com.souzamelo.ProjetoVenda.model.entity.Product;
import com.souzamelo.ProjetoVenda.repositories.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class ProductService {


    private final ProductRepository repository;

    public List<Product> findAll() {
        return repository.findAll();
    }

    public Product findbyId(Long id) {
        Optional<Product> obj = repository.findById(id);
        return obj.get();
    }
}