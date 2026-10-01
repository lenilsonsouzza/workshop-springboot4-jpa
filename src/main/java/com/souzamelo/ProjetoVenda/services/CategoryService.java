package com.souzamelo.ProjetoVenda.services;

import com.souzamelo.ProjetoVenda.model.entity.Category;

import com.souzamelo.ProjetoVenda.repositories.CategoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class CategoryService {


    private final CategoryRepository repository;

    public List<Category> findAll() {
        return repository.findAll();
    }

    public Category findbyId(Long id) {
        Optional<Category> obj = repository.findById(id);
        return obj.get();
    }
}