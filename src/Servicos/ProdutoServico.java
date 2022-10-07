package Servicos;
import java.util.List;
import Class.Produto;
import Repositorios.RepositorioProduto;

public class ProdutoServico {
	RepositorioProduto rp = new RepositorioProduto();
	
	public void adicionaProdutos(String nome, String fabricante, double preco) {
		Produto prod = new Produto(nome, fabricante, preco);
		rp.adicionaProdutos(prod);
	}
	
	public List<Produto> lista() {
        return null;
    }
}
	
	

