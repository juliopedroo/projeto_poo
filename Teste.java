
public class Teste {

	//Array[]
	public static void main(String[] args) {
		
		
		Conta[] contas = new Conta[5];//cria um array de contas(tudo inicia com null)
		ContaCorrente cc = new ContaCorrente(134,45); 
		contas[0] = cc; 
		Object[] arrayGenerico = new Object[5]; //array de generico 
		Cliente cliente = new Cliente(); 
		arrayGenerico[0] = cliente;  
		arrayGenerico[1] = cc;   
		ContaPoupanca cp = new ContaPoupanca(1231,3123,123); 
		Conta[] contas2 = {cp,cc,null,null,null};
		Conta[] contas3 = new Conta[5];
	
		
		ContaPoupanca ref = (ContaPoupanca) contas3[1]; //type cast
		ContaCorrente refCc = (ContaCorrente) contas[0]; 
		System.out.println(contas[0]); //me delvove o endereco de memoria da minha cc
		System.out.println(contas[0].getSaldo());
		contas[0].deposita(200);
		System.out.println(contas[0].getSaldo());
		System.out.println(contas2[0].getSaldo());

	}


}
