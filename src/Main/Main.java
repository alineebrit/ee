package Main;
import Fachadas.FachadaProduto;
import Fachadas.FachadaLote;


public class Main {
	
 public static void main(String[]args) {
	 FachadaProduto fp = new FachadaProduto();
	 FachadaLote fl = new FachadaLote();
	 
	 fp.adicionaProduto("Arroz Parbolizado", "Urbano", 5.50);
	 fp.adicionaProduto("Macarr�o Fino", "Imperador", 2.89);
	 fl.criarLote(1000, "25/05/2026", "Arroz Parbolizado");
	 fl.adicionaLote(1500, "26/06/2025", "Macarr�o Fino");

 }
}

