package exercicios_java;

import java.util.Locale;
import java.util.Scanner;

public class Diferenca_produto {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int a, b, c, d, diferenca;

		System.out.print("A: ");
		a = sc.nextInt();
		System.out.print("B: ");
		b = sc.nextInt();
		System.out.print("C: ");
		c = sc.nextInt();
		System.out.print("D: ");
		d = sc.nextInt();
		
		diferenca = (a * b - c * d);
		
		System.out.println("Diferença: " + diferenca);
		
		
		sc.close();
		
	}

}
