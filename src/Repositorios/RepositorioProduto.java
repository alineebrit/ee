package Repositorios;
import java.util.ArrayList;
import java.util.List;
import Class.Produto;

public class RepositorioProduto {

List<Produto>lista = new ArrayList<>();

	public List<Produto> listaProdutos() {
		return lista;
	}
	
	public void adicionaProdutos(Produto prod){
		lista.add(prod);
		
	}
	
}
