
public class TestaSistema {
	public static void main(String[] args) throws SaldoInsuficienteException {
		ContaPoupanca conta1 = new ContaPoupanca(1234,5678,80);
		Cliente pedro = new Cliente(); 
		
		conta1.deposita(200);
		
		System.out.println(conta1.getSaldo());
		conta1.setTitular(pedro);
		Cliente titularConta = conta1.getTitular();
		
		titularConta.setNome("Joao Pedro"); 
		
		ContaCorrente cc = new ContaCorrente(1322,4535); 
		
		Cliente joao = new Cliente(); 
		cc.setTitular(joao);
		
		cc.deposita(200); 
		
		CalculaBoni calcula = new CalculaBoni(); 
		
		calcula.registro(cc);
		
		System.out.println(calcula.getSaldo());
		
		Cliente jose = new Cliente(); 
		
		cc.setTitular(jose);
		
		ContaPoupanca cp = new ContaPoupanca(534,4345, 1500.0);
		
		cc.transfere(10.0, cp);
		System.out.println("CC: " + cc.getSaldo());
		System.out.println("CP: " + cp.getSaldo());
		
		ContaPoupanca cp2 = new ContaPoupanca(122,43,50); 
		
		cp2.deposita(50);
		
		System.out.println(cp2.getSaldo());
		
		ContaCorrente contaJoao = new ContaCorrente(1,5); 
		
		contaJoao.saca(124444); 
		
	}

}
