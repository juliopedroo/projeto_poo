package com.br.unibank.unibank.DAO;

import java.math.BigDecimal;

import org.springframework.data.repository.CrudRepository;
	
import com.br.unibank.unibank.model.Conta;

public interface IConta extends  CrudRepository<Conta, BigDecimal> {
		
}	
