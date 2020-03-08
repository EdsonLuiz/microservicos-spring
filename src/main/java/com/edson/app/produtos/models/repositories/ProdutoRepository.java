package com.edson.app.produtos.models.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.edson.app.produtos.models.entities.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
 
}
