package Servicos;
import java.util.List;
import Class.Produto;
import Repositorios.RepositorioProduto;

public class ProdutoServico {
	RepositorioProduto rp = new RepositorioProduto();
	
	public void criarProdutos(String nome, String fabricante, double preco) {
		Produto prod = new Produto(nome, fabricante, preco);
		rp.cadastrandoProdutos(prod);
	}
	
	public List<Produto> lista() {
        return null;
    }
}
	
	

