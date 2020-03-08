package com.edson.app.produtos.models.services;

import java.util.List;

import com.edson.app.produtos.models.entities.Produto;

public interface ProdutoService {
	public List<Produto> findAll();
	public Produto findById(Long id);
}
