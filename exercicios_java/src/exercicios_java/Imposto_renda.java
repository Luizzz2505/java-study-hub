/**
 Sistema coleta o valor de salário do usuário morador de Lisarb. 
 Até R$ 2.000,00 é isento de imposto de renda. Para o valor que estiver de R$ 2.000,00 
 até R$ 3.000,00 é aplicado 8% de imposto. O que estiver entre R$ 3.000,00 e R$ 4.500,00 
 é aplicado 18% de imposto. Para o valor que ultrapassa R$ 4.500,00 é aplicado 28% de 
 imposto. 
**\
 */
package exercicios_java;

import java.util.Locale;
import java.util.Scanner;

public class Imposto_renda {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double salario, imposto, conta;
		
		System.out.print("Informe seu salário: ");
		salario = sc.nextDouble();
		
		if (salario <= 2000.0) {
			System.out.println("Seu salário está isento de imposto");
		}
		else if ((salario > 2000.0) && (salario <= 3000.0)){
			imposto = (salario - 2000.0) * 0.08;
			System.out.println("Salário: " + salario);
			System.out.printf("A pagar: %.2f%n", imposto);
		}
		else if ((salario > 3000.0) && (salario <= 4500.0)) {
			imposto = (1000.0 * 0.08) + ((salario - 3000.0) * 0.18);
			System.out.println("Salário: " + salario);
			System.out.printf("A pagar: %.2f%n", imposto);
		}
		else {
			imposto = (1000.0 * 0.08) + (1500.0 * 0.18) + ((salario - 4500.0) * 0.28);			
			System.out.println("Salário: " + salario);
			System.out.printf("A pagar: %.2f%n", imposto);
		}		
		
		
		sc.close();
		
	}

}
