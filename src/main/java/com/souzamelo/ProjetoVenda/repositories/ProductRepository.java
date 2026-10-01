package com.souzamelo.ProjetoVenda.repositories;

import com.souzamelo.ProjetoVenda.model.entity.Category;
import com.souzamelo.ProjetoVenda.model.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {

}
