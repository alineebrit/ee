package Servicos;
import java.util.List;
import Class.Produto;
import Fachadas.Sting;
import Fachadas.String;
import Repositorios.RepositorioProduto;

public class ProdutoServico {
	Produto prod = new Produto();
	RepositorioProduto rp = new RepositorioProduto();
	
	public void lerProdutos() {
		List<Produto>lista = rp.lerProdutos();
		for(Produto prod:lista) {
			System.out.println(prod.getNome());
		}
	}
	
	public void criarProdutos(String nome, String fabricante, double preco) {
		Produto prod = new Produto(nome, fabricante, preco);
		rp.criarProdutos();
	}
	
	public void removerProdutos(String nome, String fabricante, double preco) {
		Produto prod = new Produto(nome, fabricante, preco);
		rp.removerProdutos();
		}
	
	
	}
	
	

