package Main;

import java.util.Scanner;

public class Main {
 public static void main(String[]args) {
	 Scanner scanner = new Scanner(System.in);
	 FachadaProduto fp = new fachadaProduto();
	 String nome = scanner.nextLine();
	 String fabricante = scanner.nextLine();
	 Double peso = scanner.nextDouble();
	 
 }
 
 adicionaProduto(pf, nome,fabricante, peso);
 System.out.print();
 
 public static void adicionaProduto(FachadaProduto fp,String nome, String fabricante,double peso ) {
 	fp.adicionaproduto(nome, fabricante, peso);
 	}
 
}
 
