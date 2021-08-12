package br.com.meuf.fornecedor.service;

import br.com.meuf.fornecedor.model.Produto;
import br.com.meuf.fornecedor.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {

	@Autowired
	private ProdutoRepository produtoRepository;
	
	public List<Produto> getProdutosPorEstado(String estado) {
		return produtoRepository.findByEstado(estado);
	}

	public void setProduto(Produto produto){
		this.produtoRepository.save(produto);
	}

	
}
