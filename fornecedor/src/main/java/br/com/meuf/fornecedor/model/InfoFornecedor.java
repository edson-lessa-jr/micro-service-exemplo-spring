package br.com.meuf.fornecedor.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class InfoFornecedor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    @Column(unique = true, nullable = false)
    private String estado;
    private String endereco;

    public void setEstado(String estado){
        this.estado = estado.toUpperCase();
    }
}
