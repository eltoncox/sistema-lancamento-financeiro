package com.elton.algamoney_api.service;

import java.util.Optional; // 5.6 Regra para nao salvar pessoa inativa

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.elton.algamoney_api.model.Lancamento;
import com.elton.algamoney_api.model.Pessoa;
import com.elton.algamoney_api.repository.LancamentoRepository;
import com.elton.algamoney_api.repository.PessoaRepository;
import com.elton.algamoney_api.service.exception.PessoaInexistenteOuInativaException;

@Service
public class LancamentoService {
	
	@Autowired
	private PessoaRepository pessoaRepository;
	
	@Autowired 
	private LancamentoRepository lancamentoRepository;

	public Lancamento salvar(Lancamento lancamento) {
		Optional<Pessoa> pessoa = pessoaRepository.findById(lancamento.getPessoa().getCodigo());
		if (pessoa.isEmpty() || pessoa.get().isInativo()) {
			throw new PessoaInexistenteOuInativaException();
		}
		
		return lancamentoRepository.save(lancamento);
	}
	
}
