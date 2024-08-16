package problema;

public class Usuario implements Observer{
	
	private String nome;
	
	public Usuario(String nome) {
		this.nome = nome;
	}
	
	public void update(String msg) {
		System.out.println(msg);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}