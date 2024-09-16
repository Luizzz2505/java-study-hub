/*
 * Faça um programa para ler dois valores inteiros, e depois mostrar na 
 * tela a soma desses números com uma
mensagem explicativa, conforme exemplos.*\
 */

package exercicios_java;

import java.util.Scanner;

public class soma_int {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n1, n2, soma;
		
		System.out.print("n1: ");
		n1 = sc.nextInt();
		System.out.print("n2: ");
		n2 = sc.nextInt();
		
		soma = n1 + n2;
		
		System.out.println("Soma: " + soma);
		
		sc.close();
		
	}

}
