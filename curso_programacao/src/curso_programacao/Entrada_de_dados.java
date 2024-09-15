package curso_programacao;

import java.util.Scanner;
import java.util.Locale;

public class Entrada_de_dados {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		String x;
		int a;
		double b;
		char c;
		
		System.out.print("Digite seu nome: ");
		x = sc.next();
		
		System.out.print("Informe sua idade: ");
		a = sc.nextInt();
		
		System.out.print("Informe quanto vc ganha: ");
		b = sc.nextDouble();
		
		System.out.print("Informe seu gênero: ");
		c = sc.next().charAt(0);
		
		System.out.println("Nome: " + x);
		System.out.println("Idade: " + a);
		System.out.printf("Você ganha: R$%.2f%n", b);
		System.out.println("Gênero: " + c);
		
		sc.close();
	}

}
