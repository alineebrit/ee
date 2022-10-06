package Repositorios;

import java.util.ArrayList;
import java.util.List;
import Class.Lote;

public class RepositorioLote {

	List<Lote>listalote = new ArrayList<>();

	public List<Lote>lerLote() {
		return listalote;
	}

	public void criarLote() {
		
	}
	
	public void cadastrandoLote(Lote l){
		listalote.add(l);
		
	}
	
}
