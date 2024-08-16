package problema;

public class Main {

	public static void main(String[] args) {

		Usuario obs1 = new Usuario("Seguidor1");
		Usuario obs2 = new Usuario("Seguidor2");
		Usuario dono = new Usuario("Dono");
		Publicacao publicacao = new Publicacao(dono);
		publicacao.setNewPubli("Publicação teste");
		
		publicacao.receberLike(obs2);
		publicacao.receberLike(obs1);
		
	}
}