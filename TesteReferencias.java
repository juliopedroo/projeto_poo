
public class TesteReferencias {

	public static void main(String[] args) {
		
		GuardadorDeContas guardador = new GuardadorDeContas(); 
		Conta cc = new ContaCorrente(123,312); 
		guardador.adiciona(cc);
		Conta cp = new ContaPoupanca(123,312,1234);
		
		guardador.adiciona(cp); 
		
		int tamanho = guardador.tamanhoArray();
		System.out.println(tamanho);
		
		Conta ref0 = guardador.getReferencia(0);
		
		System.out.println(ref0);
	}

}
