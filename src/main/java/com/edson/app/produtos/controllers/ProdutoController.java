package com.edson.app.produtos.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.edson.app.produtos.models.entities.Produto;
import com.edson.app.produtos.models.services.ProdutoService;

@RestController
public class ProdutoController {

	@Autowired
	private ProdutoService produtoService;
	
	@GetMapping("/produtos")
	public List<Produto> index() {
		return produtoService.findAll();
	}
	
	@GetMapping("/produtos/{id}")
	public Produto show(@PathVariable Long id) {
//		try {
//			Thread.sleep(2000L);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		return produtoService.findById(id);
	}
}
