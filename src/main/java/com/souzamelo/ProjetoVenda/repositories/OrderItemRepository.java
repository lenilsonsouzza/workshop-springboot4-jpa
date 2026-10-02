package com.souzamelo.ProjetoVenda.repositories;

import com.souzamelo.ProjetoVenda.model.entity.OrderItem;
import com.souzamelo.ProjetoVenda.model.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem,Long> {


}
