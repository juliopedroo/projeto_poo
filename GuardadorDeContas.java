
public class GuardadorDeContas {
	private Conta[] referencias;
	private int posicaoLivre;
	
	public GuardadorDeContas() {
		posicaoLivre =0 ; 
		this.referencias = new Conta[10]; 
	}
	
	public void adiciona(Conta conta) {
		this.referencias[posicaoLivre] = conta;
		posicaoLivre++;
	}
	public int tamanhoArray() {
		return this.posicaoLivre; 
		
	}

	public Conta getReferencia(int posicao) {
		return referencias[posicao]; 
	}
}
