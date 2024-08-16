package problema2;

public class Main {

	public static void main(String[] args) {
		Estoque estoque = new Estoque();
		estoque.follow(new Vendas());
		estoque.follow(new Relatorio());
		estoque.follow(new Marketing());
		estoque.alterarProduto(new Produto(10, 1, "maça"));
		estoque.alterarProduto(new Produto(8, 1, "maça"));
	}
}