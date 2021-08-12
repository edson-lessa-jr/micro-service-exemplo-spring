package br.com.meuf.fornecedor.repository;

import br.com.meuf.fornecedor.model.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Long>{

}
