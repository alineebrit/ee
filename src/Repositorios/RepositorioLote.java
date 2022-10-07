package Repositorios;

import java.util.ArrayList;
import java.util.List;
import Class.Lote;

public class RepositorioLote {

	List<Lote>listalote = new ArrayList<>();

	public List<Lote>listaLote() {
		return listalote;
	}

	public void criarLote() {
		
	}
	
	public void adicionaLote(Lote l){
		listalote.add(l);
		
	}
	
}
