package Fachadas;
import java.util.List;

import Servicos.ProdutoServico;


public class FachadaProduto {
	
		ProdutoServico servico = new ProdutoServico();

		public FachadaProduto() {
			this.servico = new ProdutoServico();
		}
		
		public void adicionaProduto(String nome, String fabricante, double peso) {
			this.servico.criarProdutos(nome, fabricante, peso);
		}
	
		public List<Produto> lista(){
			return this.servico.lista();
		}

	
	}

