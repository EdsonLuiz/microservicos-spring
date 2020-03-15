package com.edson.app.produtos.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.edson.app.produtos.models.entities.Produto;
import com.edson.app.produtos.models.repositories.ProdutoRepository;

@Service
public class ProdutoServiceImpl implements ProdutoService {

	@Autowired
	private ProdutoRepository produtoRepository;
	
	@Override
	@Transactional(readOnly = true)
	public List<Produto> findAll() {
		return produtoRepository.findAll();
	}

	@Override
	public Produto findById(Long id) {
		return produtoRepository.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public Produto save(Produto produto) {
		return produtoRepository.save(produto);
	}

	@Override
	@Transactional
	public void deleteById(Long id) {
		produtoRepository.deleteById(id);
	}

}
