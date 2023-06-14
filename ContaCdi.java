
public class ContaCdi extends Conta {
	
	public ContaCdi(int agencia,int numero) {
		super(agencia,numero); 
	}
	
	@Override
	public double getBonificacao() {
		
		return 10;
	}

}
