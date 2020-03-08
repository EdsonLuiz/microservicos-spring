package com.edson.app.produtos.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.edson.app.produtos.models.entities.Produto;

@Service
public class ProdutoServiceImpl implements ProdutoService {

	@Autowired
	private ProdutoService produtoService;
	
	@Override
	@Transactional(readOnly = true)
	public List<Produto> findAll() {
		return produtoService.findAll();
	}

	@Override
	public Produto findById(Long id) {
		return produtoService.findById(id);
	}

}
