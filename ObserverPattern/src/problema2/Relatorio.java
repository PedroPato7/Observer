package problema2;

public class Relatorio implements Observer{
	
	@Override
	public void update(String msg) {
		System.out.println("Relatorios notificadas: " + msg);
	}
}
