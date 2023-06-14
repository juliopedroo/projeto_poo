
public class CalculaBoni {
	private double saldo;
	
	public double getSaldo() {
		return saldo;
	}
	
	public void registro(Conta c) {
		double boni = c.getBonificacao();
		saldo += boni; 
	}
}
