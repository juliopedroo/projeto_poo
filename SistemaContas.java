
public class SistemaContas {
	private int senha = 1234; 
	
	public void autentica(ContasAutenticaveis c) throws SenhaIncorretaExeception {
		boolean autenticou = c.autentica(this.senha);
		if(autenticou) {
			System.out.println("Voce PODE entrar no sistema");
		}else {
			System.out.println("Voce nao pode entrar no sistema");
		}
	}
}
