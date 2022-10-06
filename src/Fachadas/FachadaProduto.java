package Fachadas;

import java.util.List;

import Servicos.ProdutoServico;


public class FachadaProduto {
	
		ProdutoServico servico = new ProdutoServico();

		public FachadaProduto() {
			this.servico = new ProdutoServico();
		}
		
		public void adicionaProduto(String nome, String fabricante, double peso) {
			this.servico.adicionaProduto(nome, fabricante, peso);
		}
		
		public List<Produto> listaProdutos(){
			return this.servico.listaProdutos();
		}
		
		public void lerProdutos() {
			servico.lerProdutos();
		}
		
		public void criarProdutos() {
			servico.criarProdutos();
		}
		

		
		
	}

