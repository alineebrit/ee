package Fachadas;
import java.util.List;

import Class.Lote;
import Class.Produto;
import Servicos.LoteServico;


public class FachadaLote {

	LoteServico servico;

	public FachadaLote() {
		this.servico = new LoteServico();
	}
	
	public void adicionaLote(int qtd, String dataV, Produto prod) {
		this.servico.adicionaLote( qtd, dataV,  prod);
	}
	
	public List<Lote> listaLotes(){
		return this.servico.listaLotes();
	}
	
	public void lerLote() {
		servicos.lerLote();
	}
	
	public void criarLote(int qtd, String data, String nome) {
		servicos.criarLote(qtd, data, nome);
	}

}


