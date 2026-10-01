package com.souzamelo.ProjetoVenda.repositories;

import com.souzamelo.ProjetoVenda.model.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order,Long> {

}
