package Servicos;
import java.util.List;
import Class.Lote;
import Class.Produto;
import Repositorios.RepositorioLote;

public class LoteServico {
	RepositorioLote rl = new RepositorioLote();
	
	public void lerLote() {
		List<Produto>lista = rl.lerProdutos();
			for(Produto prod:lista) {
				System.out.println(prod.getNome());
			}
	}
	
	public void criarLote(int qtd, String data, String nome) {
		Lote l = new Lote(qtd, data, nome);
		rl.criarLote();
	}
	
	
	
}
