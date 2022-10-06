package Fachadas;
import Class.Produto;
import Servicos.LoteServico;


public class FachadaLote {

	LoteServico servico;

	public FachadaLote() {
		this.servico = new LoteServico();
	}
	
	public void adicionaLote(int qtd, String dataV, Produto prod) {
		this.servico.criarLote( qtd, dataV,  prod);
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


