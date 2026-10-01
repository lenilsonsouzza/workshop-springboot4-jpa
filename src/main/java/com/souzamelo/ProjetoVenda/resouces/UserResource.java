package com.souzamelo.ProjetoVenda.resouces;

import com.souzamelo.ProjetoVenda.model.entity.User;
import com.souzamelo.ProjetoVenda.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RequiredArgsConstructor
@RestController
@RequestMapping(value = "/users")
public class UserResource {


    private final UserService service;

   @GetMapping
    public ResponseEntity<List<User>> findAll() {
       List<User> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<User> findById(@PathVariable Long id){
       User obj = service.findbyId(id);
       return ResponseEntity.ok().body(obj);
    }

}
