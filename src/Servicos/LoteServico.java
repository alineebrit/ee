package Servicos;
import java.util.List;
import Class.Lote;
import Repositorios.RepositorioLote;

public class LoteServico {
	RepositorioLote rl = new RepositorioLote();

	public void cadastrandoLote(int qtd, String data, String nome) {
		Lote l = new Lote(qtd, data, nome);
		rl.cadastrandoLote(l);
	}

    public List<Lote> listaLotes() {
        return null;
    }
	
	
	
}
