package com.br.unibank.unibank.controller;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.br.unibank.unibank.DAO.IConta;
import com.br.unibank.unibank.model.Conta;

@RestController
@CrossOrigin("*")
@RequestMapping("/conta")
public class ContaController {
	@Autowired
	private IConta dao;
	
	@GetMapping
	public void getSaldo(@RequestBody Conta conta) {
		conta.getSaldo();
		conta.getIdConta();
		conta.getNumero();
	}
	
	
	@PostMapping
	public Conta criarConta(@RequestBody Conta conta) {
		 Conta contaNovo = dao.save(conta);
		 return contaNovo; 
	}
	
	@PutMapping
	public Conta editarConta(@RequestBody Conta conta) {
		 Conta contaEditar = dao.save(conta);
		 return contaEditar; 
	}
	
	
}
