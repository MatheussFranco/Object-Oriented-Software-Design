package br.edu.unifei.ecot12.lab01;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		CampoMinado c = new CampoMinado();
		Scanner s = new Scanner(System.in);
		
		while(c.isFimJogo() == false) {
			c.imprime(c.getVisual());
			System.out.print("lin:");
			int lin=s.nextInt();
			System.out.print("col:");
			int col=s.nextInt();
			c.desarme(lin, col);
		}
		if(c.isFimJogo() == true) {
			System.out.println("Você Perdeu!");
			c.imprime(c.getJogo());
		}
	}

}
