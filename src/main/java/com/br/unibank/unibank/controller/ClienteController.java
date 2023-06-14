package com.br.unibank.unibank.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.br.unibank.unibank.DAO.IUsuario;
import com.br.unibank.unibank.model.Cliente;

@RestController
@CrossOrigin("*")
@RequestMapping("/cliente")
public class ClienteController{
	
	@Autowired
	private IUsuario dao;
	
	
	@GetMapping
	public List<Cliente> cliente() {
		return (List<Cliente>) dao.findAll();
	}
	
	@PostMapping
	public Cliente criarCliente(@RequestBody Cliente cliente) {
		 Cliente clienteNovo = dao.save(cliente);
		 return clienteNovo; 
	}
	
	@PutMapping
	public Cliente editarCliente(@RequestBody Cliente cliente) {
		 Cliente clienteEditar = dao.save(cliente);
		 return clienteEditar; 
	}
	@DeleteMapping("/{id}")
	public Optional<Cliente> excluirCliente(@PathVariable Integer id) {
		 Optional<Cliente> clienteExcluir = dao.findById(id);
		 dao.deleteById(id);
		 return clienteExcluir; 
	}
}
