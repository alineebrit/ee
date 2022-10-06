package Main;
import Class.Produto;
import Class.Lote;
import Fachadas.FachadaProduto;
import Fachadas.FachadaLote;


public class Main {
	
 public static void main(String[]args) {
	 FachadaProduto fp = new fachadaProduto();
	 FachadaLote fl = new fachadaProduto();
	 
 }
 
 Produto arroz = fp.criarProduto("Arroz Parbolizado", "Urbano", 5.50);
 Produto macarrao = fp.criarProduto("Macarrão Fino", "Imperador", 2.89);
 	for (Produto prod: fp.listarProdutos())
	 System.out.println(prod.toString());
 	System.out.println();
 	
	}
 
fl = fl.criarLote(1000, "25/05/2026", "Arroz Parbolizado");
Produto macarrao = fp.criarProduto(1500, "26/06/2025", "Macarrão Fino");
	for (Lote l: fl.listarProdutos())
	 System.out.println(l.toString());
	System.out.println();
	
	}

}


