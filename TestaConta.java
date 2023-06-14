
public class TestaConta {
	public static void main(String[] args) throws SenhaIncorretaExeception {
		ContaPoupanca cp = new ContaPoupanca(123, 40, 440);
		
		cp.setSenha(123);
		cp.autentica(1234);
		
		SistemaContas si = new SistemaContas(); 
		
		si.autentica(cp);
	}

}
