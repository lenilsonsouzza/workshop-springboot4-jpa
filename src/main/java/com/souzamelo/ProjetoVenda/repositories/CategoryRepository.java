package com.souzamelo.ProjetoVenda.repositories;

import com.souzamelo.ProjetoVenda.model.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category,Long> {

}
