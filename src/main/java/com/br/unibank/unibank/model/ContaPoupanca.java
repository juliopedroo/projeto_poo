package com.br.unibank.unibank.model;

public class ContaPoupanca extends Conta {
	private double rendimento;

	public double getRendimento() {
		return super.getSaldo() * 0.2;
	}

	public void setRendimento(double rendimento) {
		this.rendimento = rendimento;
	}
	
	public double totalComRendimento(ContaPoupanca cp) {
		return cp.getRendimento() + super.getSaldo(); 
	}
}
