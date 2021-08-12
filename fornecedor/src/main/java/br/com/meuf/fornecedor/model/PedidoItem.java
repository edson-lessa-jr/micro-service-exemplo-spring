package br.com.meuf.fornecedor.model;

import lombok.Data;

import javax.persistence.*;

@Entity @Data
public class PedidoItem {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private Integer quantidade;
	
	@ManyToOne @JoinColumn(name = "produtoId")
	private Produto produto;


}
