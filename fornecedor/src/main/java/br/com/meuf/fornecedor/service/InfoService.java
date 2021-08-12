package br.com.meuf.fornecedor.service;


import br.com.meuf.fornecedor.model.InfoFornecedor;
import br.com.meuf.fornecedor.repository.InfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InfoService {

	@Autowired
	private InfoRepository infoRepository;
	
	public InfoFornecedor getInfoPorEstado(String estado) {
		return infoRepository.findInfoFornecedorByEstado(estado.toUpperCase());
	}

	public void setInfoFornecedor(InfoFornecedor infoFornecedor) {
		infoRepository.save(infoFornecedor);
	}
}
