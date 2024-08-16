package problema2;

public class Marketing implements Observer{

	@Override
	public void update(String msg) {
		System.out.println("Marketing notificadas: " + msg);
	}
}
