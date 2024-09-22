/*
 * Escreva um programa para ler as coordenadas (X,Y) de uma quantidade 
 * indeterminada de pontos no sistema
cartesiano. Para cada ponto escrever o quadrante a que ele pertence.
 O algoritmo será encerrado quando pelo
menos uma de duas coordenadas for NULA (nesta situação sem escrever mensagem alguma).*\
 */
package exercicios_java;

import java.util.Scanner;

public class PontoCartesiano {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			if (x == 0 || y == 0) {
				break; // encerra o loop se qualquer coordenada for zero
			}
			
			if (x > 0 && y > 0) {
				System.out.println("Primeiro");
			}
			else if(x < 0 && y > 0) {
				System.out.println("Segundo");
			}
			else if(x < 0 && y < 0) {
				System.out.println("Terceiro");
			}
			else if(x > 0 && y < 0) {
				System.out.println("Quarto");
			}
			
		}
		
		sc.close();

	}

}
