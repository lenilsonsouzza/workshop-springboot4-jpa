package com.souzamelo.ProjetoVenda.resouces;

import com.souzamelo.ProjetoVenda.model.entity.Category;
import com.souzamelo.ProjetoVenda.model.entity.User;
import com.souzamelo.ProjetoVenda.services.CategoryService;
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
@RequestMapping(value = "/categories")
public class CategoryResource {


    private final CategoryService service;

   @GetMapping
    public ResponseEntity<List<Category>> findAll() {
       List<Category> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Category> findById(@PathVariable Long id){
    Category obj = service.findbyId(id);
       return ResponseEntity.ok().body(obj);
    }

}
