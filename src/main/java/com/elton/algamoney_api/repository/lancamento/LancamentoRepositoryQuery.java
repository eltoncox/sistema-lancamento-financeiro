package com.elton.algamoney_api.repository.lancamento;

import java.util.List;

import com.elton.algamoney_api.model.Lancamento;
import com.elton.algamoney_api.repository.filter.LancamentoFilter;


public interface LancamentoRepositoryQuery {

	public List<Lancamento> filtrar(LancamentoFilter lancamentoFilter);
	
}
