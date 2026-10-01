package com.souzamelo.ProjetoVenda.resouces;

import com.souzamelo.ProjetoVenda.model.entity.Category;
import com.souzamelo.ProjetoVenda.model.entity.Product;
import com.souzamelo.ProjetoVenda.services.CategoryService;
import com.souzamelo.ProjetoVenda.services.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping(value = "/products")
public class ProductResource {


    private final ProductService service;

   @GetMapping
    public ResponseEntity<List<Product>> findAll() {
       List<Product> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Product> findById(@PathVariable Long id){
    Product obj = service.findbyId(id);
       return ResponseEntity.ok().body(obj);
    }

}
