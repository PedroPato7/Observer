package problema2;

public class Vendas implements Observer{

	@Override
	public void update(String msg) {
		System.out.println("Vendas notificadas: " + msg);
	}

}
