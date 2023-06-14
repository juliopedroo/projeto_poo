
public class SenhaIncorretaExeception extends Exception {
	
	@Override
	public String getMessage() {
		return "Senha Incorreta"; 
	}
}
