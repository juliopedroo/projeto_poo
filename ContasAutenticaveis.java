
public abstract class ContasAutenticaveis extends Conta {
	private int senha; 
	
	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	public boolean autentica(int senha)throws SenhaIncorretaExeception {
		if(this.senha == senha) {
			System.out.println("Sabe a senha");
			return true;
		}else {
			throw new SenhaIncorretaExeception();
		}
	}
	public ContasAutenticaveis(int agencia,int numero) {
		super(agencia,numero); 
	}
	@Override
	public double getBonificacao() {
		// TODO Auto-generated method stub
		return 0;
	}

}
