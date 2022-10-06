package Fachadas;
import Servicos.ProdutoServico;


public class FachadaProduto {
	
		ProdutoServico servico = new ProdutoServico();

		public FachadaProduto() {
			this.servico = new ProdutoServico();
		}
		
		public void adicionaProduto(String nome, String fabricante, double peso) {
			this.servico.criarProduto(nome, fabricante, peso);
		}
	
		public void listaProdutos(){
			servico.lerProdutos();
		}
	
	}

