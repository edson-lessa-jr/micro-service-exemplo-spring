package br.com.meuf.fornecedor.controller;

import br.com.meuf.fornecedor.dto.ProdutoDTO;
import br.com.meuf.fornecedor.model.Produto;
import br.com.meuf.fornecedor.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produto")
public class ProdutoController {

	@Autowired
	private ProdutoService produtoService;
	
	@GetMapping("/{estado}")
	public List<Produto> getProdutosPorEstado(@PathVariable("estado") String estado) {
		return produtoService.getProdutosPorEstado(estado);
	}

	@PostMapping
	public void setProduto(@RequestBody ProdutoDTO produtoDTO){
		produtoService.setProduto(produtoDTO.convertParaProduto());
	}
}
