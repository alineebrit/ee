package Fachadas;
import java.util.List;
import Class.Lote;
import Servicos.LoteServico;


public class FachadaLote {

	LoteServico sl= new LoteServico();

	public FachadaLote() {
		this.sl = new LoteServico();
	}
	
	public void adicionaLote(int qtd, String dataV, String nome) {
		this.sl.cadastrandoLote( qtd, dataV, nome);
	}
	
	public List<Lote> listaLotes(){
		return this.sl.listaLotes();
	}
	
	public void criarLote(int qtd, String data, String nome) {
		sl.cadastrandoLote(qtd, data, nome);
	}

}


