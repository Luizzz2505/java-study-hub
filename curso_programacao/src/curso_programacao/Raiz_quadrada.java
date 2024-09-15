package curso_programacao;

import java.util.Scanner;
import java.util.Locale;

public class Raiz_quadrada {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double a, b, c;
		double delta, x1, x2;
		
		System.out.print("Valor de a: ");
		a = sc.nextDouble();
		System.out.print("Valor de b: ");
		b = sc.nextDouble();
		System.out.print("Valor de C: ");
		c = sc.nextDouble();
		
		delta = Math.pow(b, 2.0) - 4 * a * c;
		
		x1 = (-b + Math.sqrt(delta)) / (2 * a);
		x2 = (-b - Math.sqrt(delta)) / (2 * a);
		
		System.out.println(x1);
		System.out.println(x2);
	}

}
