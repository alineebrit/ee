package Repositorios;

import java.util.ArrayList;
import java.util.List;
import Class.Produto;

public class RepositorioLote {

	List<Produto>lista = new ArrayList<>();

	public List<Produto>lerLote() {
		return lista;
	}

	public void criarLote() {
		
	}
	
	public void cadastrandoProdutos(Produto prod){
		lista.add(prod);
		
	}
	
}
