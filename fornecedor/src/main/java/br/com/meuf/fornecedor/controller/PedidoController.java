package br.com.meuf.fornecedor.controller;


import br.com.meuf.fornecedor.dto.ItemDoPedidoDTO;
import br.com.meuf.fornecedor.model.Pedido;
import br.com.meuf.fornecedor.service.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("pedido")
public class PedidoController {

    @Autowired
    private PedidoService pedidoService;

    @PostMapping
    public Pedido realizaPedido(@RequestBody List<ItemDoPedidoDTO> produtos) {
        return pedidoService.realizaPedido(produtos);
    }

    @GetMapping("/{id}")
    public Pedido getPedidoPorId(@PathVariable Long id) {
        return pedidoService.getPedidoPorId(id);
    }

    @GetMapping
    public List<Pedido> getPedidoTodos() {
        return pedidoService.getPedidoTodos();
    }
}
