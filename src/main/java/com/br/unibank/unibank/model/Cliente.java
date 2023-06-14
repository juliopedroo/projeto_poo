package com.br.unibank.unibank.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "cadastro_usuarios")
public class Cliente {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")	
	private Integer id ;
	@Column(name = "titular", length = 20, nullable = false)
	private String titular;
	@Column(name = "profissao", length = 30, nullable = true)
	private String profissao; 
	@Column(name = "cpf", length = 11, nullable = true)
	private String cpf;
	@Column(name = "tipoConta", length = 30, nullable = true)
	private String tipoConta; 
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public String getProfissao() {
		return profissao;
	}
	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
}
