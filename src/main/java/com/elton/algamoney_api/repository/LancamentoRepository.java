package com.elton.algamoney_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.elton.algamoney_api.model.Lancamento;
import com.elton.algamoney_api.repository.lancamento.LancamentoRepositoryQuery;

@Repository
public interface LancamentoRepository 
		extends JpaRepository<Lancamento, Long> , LancamentoRepositoryQuery {
    
}