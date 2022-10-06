package Repositorios;
import java.util.ArrayList;
import java.util.List;
import Class.Produto;

import Class.Produto;


public class RepositorioProduto {

List<Produto>lista = new ArrayList<>();

	public List<Produto> lerProdutos() {
		return lista;
	}

	public void criarProdutos() {
		
	}
	
	public void removerProdutos(Produtos prod) {
		lista.remove(prod);
	}
	
	public void cadastrandoProdutos(Produtos prod){
		lista.add(prod);
		
	}
	
}
