/*Faça um programa para ler o valor do raio de um círculo,
 *  e depois mostrar o valor da área deste círculo com quatro
 *  casas decimais conforme exemplos.*\
 */


package exercicios_java;

import java.util.Locale;
import java.util.Scanner;

public class Raio_circulo {
	
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double area, PI, raio;
		
		System.out.println("Raio: ");
		raio = sc.nextDouble();
		
		PI = 3.14159;
		
		area = PI * Math.pow(raio, 2.0);
		
		System.out.printf("Área: %.4f%n", area);
		
		sc.close();
	}

}
