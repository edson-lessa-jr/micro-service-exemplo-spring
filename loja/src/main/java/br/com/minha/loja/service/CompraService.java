package br.com.minha.loja.service;

import br.com.minha.loja.client.FornecedorClient;
import br.com.minha.loja.controller.dto.CompraDTO;
import br.com.minha.loja.controller.dto.InfoFornecedorDTO;
import br.com.minha.loja.controller.dto.InfoPedidoDTO;
import br.com.minha.loja.modelo.Compra;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompraService {

    private static final Logger LOG = LoggerFactory.getLogger(CompraService.class);

    @Autowired
    private FornecedorClient fornecedorClient;


/*    @Autowired
    private RestTemplate client;

    //    Visualizar as instâncias disponíveis - opcional
    @Autowired
    private DiscoveryClient eurekaCliente;

    public void realizaCompra(CompraDTO compra) {

        ResponseEntity<InfoFornecedorDTO> exchange = client.exchange("http://fornecedor/info/" + compra.getEndereco().getEstado(),
                HttpMethod.GET, null, InfoFornecedorDTO.class);

        eurekaCliente.getInstances("fornecedor").stream()
                .forEach(fornecedor -> {
                    System.out.println("localhost:" + fornecedor.getPort());
                });
        System.out.println(exchange.getBody().getEndereco());
    }*/

    public Compra realizaCompra(CompraDTO compraDTO) {
        final String estado = compraDTO.getEndereco().getEstado();
        LOG.info("buscando informações de {}", estado);

        InfoFornecedorDTO infoPorEstado = fornecedorClient.getInfoPorEstado(estado);
        LOG.info("Realizando um pedido!");

        InfoPedidoDTO pedido = fornecedorClient.realizaPedido(compraDTO.getItens());


        Compra compra = new Compra();
        compra.setPedidoId(pedido.getId());
        compra.setTempoDePreparo(pedido.getTempoDePreparo());
        compra.setEnderecoDestino(compraDTO.getEndereco().toString());
        return compra;
    }
}
