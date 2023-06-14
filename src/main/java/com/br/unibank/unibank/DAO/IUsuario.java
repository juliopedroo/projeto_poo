package com.br.unibank.unibank.DAO;

import org.springframework.data.repository.CrudRepository;

import com.br.unibank.unibank.model.Cliente;

public interface IUsuario extends CrudRepository<Cliente, Integer> {
	
}
