package com.souzamelo.ProjetoVenda.services;

import com.souzamelo.ProjetoVenda.model.entity.User;
import com.souzamelo.ProjetoVenda.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class UserService {


    private final UserRepository repository;

    public List<User> findAll() {
        return repository.findAll();
    }

    public User findbyId(Long id) {
        Optional<User> obj = repository.findById(id);
        return obj.get();
    }

    public  User insert(User obj) {
        return  repository.save(obj);
    }

    public void delete (Long id){
        repository.deleteById(id);
    }



}