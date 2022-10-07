package Fachadas;
import java.util.List;
import Class.Lote;
import Class.Produto;
import Servicos.LoteServico;


public class FachadaLote {

	LoteServico sl= new LoteServico();

	public FachadaLote() {
		this.sl = new LoteServico();
	}
	
	public void adicionaLote(int qtd, String dataV, Produto prod) {
		this.sl.adicionaLote( qtd, dataV, prod);
	}
	
	public List<Lote> listaLotes(){
		return this.sl.listaLotes();
	}
	
	

}


