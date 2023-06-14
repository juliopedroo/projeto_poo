
public class ContaPoupanca extends ContasAutenticaveis {
	 private double valorGuardado; 

	public ContaPoupanca(int agencia, int numero,double valorGuardado) {//heranca nao da o construtor
		super(agencia,numero);// referenciando a classe mae
		this.valorGuardado = valorGuardado; 
		 
	}
	public double getBonificacao() {
		return super.getSaldo() + 20; 
	}
	public double getValorGuardado() {
		return this.valorGuardado; 
	}
	
	@Override
	public double getSaldo(){ //pegando o saldo(encapsulamento) gettter
		return getValorGuardado(); 
	}
}
