package br.com.minha.loja.client;

import br.com.minha.loja.controller.dto.InfoFornecedorDTO;
import br.com.minha.loja.controller.dto.InfoPedidoDTO;
import br.com.minha.loja.controller.dto.ItemCompraDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@FeignClient("fornecedor")
public interface FornecedorClient {
    @GetMapping("/info/{uf}")
    InfoFornecedorDTO getInfoPorEstado(@PathVariable(name = "uf") String estado);

    @PostMapping("/pedido")
    InfoPedidoDTO realizaPedido(List<ItemCompraDTO> itens);
}
