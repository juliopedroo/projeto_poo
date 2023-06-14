
public class ContaCorrente extends ContasAutenticaveis {
	
	public ContaCorrente(int agencia, int numero) {// na heranca vc nao herda construtores
		super(agencia, numero);//referenciando a classe mãe 
		System.out.println("Estou criando uma Conta Corrente...");
	}
	public double getBonificacao() {
		return super.getSaldo() + 100;
	}
	
	@Override//estou sobreescrevendo o metodo da class mae
	public boolean saca(double valor) throws SaldoInsuficienteException {
		double valorASacar = valor + 0.2;
		return super.saca(valorASacar);
	}

}
