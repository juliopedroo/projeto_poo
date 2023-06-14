import java.util.ArrayList;

public class TesteUtil {

	public static void main(String[] args) {
		ArrayList lista = new ArrayList();
		
		GuardadorDeContas guardador = new GuardadorDeContas(); 
		Conta cc = new ContaCorrente(123,312); 
		guardador.adiciona(cc);
		Conta cp = new ContaPoupanca(123,312,1234);
		
		lista.add(cp); 
		lista.add(cc); 
		
		System.out.println(lista.size());
		Object ref = lista.get(0);
		
		lista.remove(0);
		System.out.println(lista.size());
		Conta cp3 = new ContaPoupanca(123,312,1234);
		Conta cp2 = new ContaPoupanca(2345,234,5431);
		lista.add(cp2);
		lista.add(cp3);
		
		for(int i = 0;  i < lista.size(); i++) {
			System.out.println("A referencia" + lista.get(i)+ "Esta na posicao: " + i);
		} 
		
		for(Object o : lista ) {
			System.out.println(o);
		}
	}

}
