package br.com.minha.loja.modelo;

import lombok.Data;

@Data
public class Compra {
    private Long pedidoId;
    private Integer tempoDePreparo;
    private String enderecoDestino;
}
