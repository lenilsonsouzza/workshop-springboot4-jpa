package com.souzamelo.ProjetoVenda.resouces;
import com.souzamelo.ProjetoVenda.model.entity.Order;
import com.souzamelo.ProjetoVenda.services.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping(value = "/orders")
public class OrderResource {


    private final OrderService service;

   @GetMapping
    public ResponseEntity<List<Order>> findAll() {
       List<Order> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Order> findById(@PathVariable Long id){
   Order obj = service.findbyId(id);
       return ResponseEntity.ok().body(obj);
    }

}
