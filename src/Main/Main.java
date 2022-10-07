package Main;
import Fachadas.FachadaProduto;
import Class.Produto;
import Fachadas.FachadaLote;


public class Main {
	
 public static void main(String[]args) {
	 FachadaProduto fp = new FachadaProduto();
	 FachadaLote fl = new FachadaLote();
	 Produto p = new Produto("Arroz Parbolizado", "Urbano", 5.50);
	 Produto pr = new Produto("Macarrao", "Imperador", 2.89);

	 fp.adicionaProduto("Arroz Parbolizado", "Urbano", 5.50);
	 fp.adicionaProduto("Macarrao Fino", "Imperador", 2.89);
	 fl.adicionaLote(1000, "25/05/2026", p);
	 fl.adicionaLote(1500, "26/06/2025", pr);

 }
}

