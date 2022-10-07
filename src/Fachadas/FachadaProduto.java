package Fachadas;
import java.util.List;
import Class.Produto;

import Servicos.ProdutoServico;


public class FachadaProduto {
	
		ProdutoServico servico = new ProdutoServico();

		public FachadaProduto() {
			this.servico = new ProdutoServico();
		}
		
		public void adicionaProduto(String nome, String fabricante, double preco) {
			this.servico.adicionaProdutos(nome, fabricante, preco);
		}
	
		public List<Produto> lista(){
			return this.servico.lista();
		}

	
	}

