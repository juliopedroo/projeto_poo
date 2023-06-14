

public abstract class Conta {
	protected double saldo;
	private int agencia;
	private int numero; 
	private Cliente titular;
	private static int total;
	
	public Conta(int agencia,int numero) { 
		Conta.total++; 
		System.out.println("O total de contas é: " + Conta.total);
		this.agencia = agencia;
		this.numero = numero; 
		System.out.println("estou Criando uma conta");
	}
	
	public boolean deposita(double valor) {
		if(valor > 0) {
			this.saldo+= valor;
			return true; 
		}else {
			return false;
		}
	}	 
	
	public boolean saca(double valor) throws SaldoInsuficienteException {
		if(valor <= this.saldo) {
			this.saldo -= valor;
			System.out.println("Saque autorizado");
			return true; 
		}else {
			throw new SaldoInsuficienteException(); 
		}
	}
	public boolean transfere(double valor, Conta destino) throws SaldoInsuficienteException {//polimorfismo(Conta é um tipo generico)
		if(valor <= this.saldo) {
			saca(valor); 
			destino.deposita(valor);
			System.out.println("Transferência autorizada");
			return true; 
		}return false; 
		 
	}
	public double getSaldo(){ //pegando o saldo(encapsulamento) gettter
		return this.saldo; 
	} 
	public int getNumero() {
		return this.numero; 
	}
	public void setNumero(int numero) {
		if(numero < 0) {
			System.out.println("Não Pode números negativos");
			return; 
		}
		this.numero = numero; 
	}
	
	public int getAgencia() {
		return this.agencia;
	}
	public void setAgencia(int agencia) {
		if(agencia < 0) {
			System.out.println("Não Pode agências com números negativos");
			return;//para a execucao 
		}
		this.agencia = agencia;
	}
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	public Cliente getTitular() {
		return titular;
	}
	public static int getTotal() {
		return total;
	}
	
	public abstract double getBonificacao();
	
}	
