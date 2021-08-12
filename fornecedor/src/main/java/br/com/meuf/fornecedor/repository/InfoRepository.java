package br.com.meuf.fornecedor.repository;

import br.com.meuf.fornecedor.model.InfoFornecedor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InfoRepository extends CrudRepository<InfoFornecedor, Long> {

    InfoFornecedor findInfoFornecedorByEstado(String estado);
}
