
public class GuardadorReferencias {
	private Object[] referencias; 
	private int posicaoLivre; 
	
	public GuardadorReferencias() {
		this.referencias = new Object[10];
		posicaoLivre = 0;  
	}
	public void adicionaObjetos(Object objeto) {
		this.referencias[posicaoLivre] = objeto; 
		posicaoLivre++; 
	}
	
	public int retornaTamanho() {
		return this.posicaoLivre; 
	}
	
	public Object getReferencia(int posicao) {
		return this.referencias[posicao]; 
	}
}
