package Repositorios;
import java.util.ArrayList;
import java.util.List;
import Class.Produto;

public class RepositorioProduto {

List<Produto>lista = new ArrayList<>();

	public List<Produto> lerProdutos() {
		return lista;
	}

	public void criarProdutos() {
		
	}
	
	public void cadastrandoProdutos(Produto prod){
		lista.add(prod);
		
	}
	
}
