package com.edson.app.produtos.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.edson.app.commons.models.entities.Produto;
import com.edson.app.produtos.models.services.ProdutoService;

@RestController
public class ProdutoController {

	@Autowired
	private ProdutoService produtoService;
	
	@GetMapping("/")
	public List<Produto> index() {
		return produtoService.findAll();
	}
	
	@GetMapping("/{id}")
	public Produto show(@PathVariable Long id) {
//		try {
//			Thread.sleep(2000L);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		return produtoService.findById(id);
	}
	
	@PostMapping("/")
	@ResponseStatus(code = HttpStatus.CREATED)
	public Produto store(@RequestBody Produto produto) {
		return produtoService.save(produto);
	}
	
	@PutMapping("/{id}")
	@ResponseStatus(code = HttpStatus.CREATED)
	public Produto update(@RequestBody Produto produto, @PathVariable Long id) {
		Produto temporaryProduto = produtoService.findById(id);
		temporaryProduto.setNome(produto.getNome());
		temporaryProduto.setPreco(produto.getPreco());
		
		return produtoService.save(temporaryProduto);
	}
	
	@DeleteMapping("/{id}")
	@ResponseStatus(code =HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		produtoService.deleteById(id);
	}
}








