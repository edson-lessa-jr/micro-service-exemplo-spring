package br.com.meuf.fornecedor.dto;

import br.com.meuf.fornecedor.model.Produto;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class ProdutoDTO {
    private String nome;
    private String estado;
    private String descricao;
    private BigDecimal preco;

    public Produto convertParaProduto(){
        Produto produto = new Produto();
        produto.setNome(nome);
        produto.setDescricao(descricao);
        produto.setPreco(preco);
        produto.setEstado(estado);
        return produto;
    }
    public void convertParaDTO(Produto produto){
        this.setNome(produto.getNome());
        this.setDescricao(produto.getDescricao());
        this.setPreco(produto.getPreco());
        this.setEstado(produto.getEstado());
    }
}
