package Servicos;
import java.util.List;
import Class.Lote;
import Class.Produto;
import Repositorios.RepositorioLote;

public class LoteServico {
	RepositorioLote rl = new RepositorioLote();

	public void cadastrandoLote(int qtd, String data, Produto prod) {
		Lote l = new Lote(qtd, data, prod);
		rl.cadastrandoLote(l);
	}

    public List<Lote> listaLotes() {
        return null;
    }
	
	
	
}
