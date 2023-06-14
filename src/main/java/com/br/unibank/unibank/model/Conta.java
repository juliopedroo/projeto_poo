package com.br.unibank.unibank.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name = "contas")
public abstract class Conta {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer idConta;
	@Column(name = "numero", nullable = true)
	private int numero; 
	@Column(name = "saldo", nullable = true)
	private int  saldo;
	public Integer getIdConta() {
		return idConta;
	}
	public void setIdConta(Integer idConta) {
		this.idConta = idConta;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public int getSaldo() {
		return saldo;
	}
	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}
	
	
}
