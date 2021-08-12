package br.com.minha.loja.controller.dto;

import lombok.Data;
import lombok.ToString;

import java.util.List;

@Data @ToString
public class CompraDTO {
    private List<ItemCompraDTO> itens;
    private EnderecoDTO endereco;
}
