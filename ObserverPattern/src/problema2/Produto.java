package problema2;

public class Produto {
	private int quantidade;
	private int codigo;
	private String nome;
	
	public Produto(int quantidade, int codigo, String nome) {
		super();
		this.quantidade = quantidade;
		this.codigo = codigo;
		this.nome = nome;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Produto [quantidade=");
		builder.append(quantidade);
		builder.append(", codigo=");
		builder.append(codigo);
		builder.append(", nome=");
		builder.append(nome);
		builder.append("]");
		return builder.toString();
	}
	
}
