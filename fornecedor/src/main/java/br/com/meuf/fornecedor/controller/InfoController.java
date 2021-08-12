package br.com.meuf.fornecedor.controller;

import br.com.meuf.fornecedor.model.InfoFornecedor;
import br.com.meuf.fornecedor.repository.InfoRepository;
import br.com.meuf.fornecedor.service.InfoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/info")
public class InfoController {
    private static final Logger LOG = LoggerFactory.getLogger(InfoController.class);
    @Autowired
    private InfoService infoService;

    @GetMapping("/{uf}")
    public InfoFornecedor getInfoPorEstado(@PathVariable(name = "uf") String estado){
        LOG.info("Recebido pedido de informações {}", estado);
        LOG.info("Informações encontradas");
        return infoService.getInfoPorEstado(estado.toUpperCase());
    }

    @PostMapping
    public void setInfoFornecedor(@RequestBody InfoFornecedor infoFornecedor){
        this.infoService.setInfoFornecedor(infoFornecedor);
    }
}
