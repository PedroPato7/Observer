package problema2;

import java.util.ArrayList;
import java.util.List;

public class Estoque extends Subject{
	private List<Produto> produtos = new ArrayList<Produto>();
	public List<Produto> getProdutos() {
		return produtos;
	}
	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}
	public void alterarProduto(Produto produto) {
        boolean produtoExiste = false;
        for (int i = 0; i < produtos.size(); i++) {
            Produto p = produtos.get(i);
            if (p.getCodigo() == produto.getCodigo()) {
                produtos.set(i, produto); 
                produtoExiste = true;
                break;
            }
        }
        if (!produtoExiste) {
            produtos.add(produto);
        }
        notifyAllMethod(produto.toString());	
	}
	
}
