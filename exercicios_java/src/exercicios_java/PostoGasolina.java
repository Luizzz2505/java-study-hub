package exercicios_java;

import java.util.Scanner;

public class PostoGasolina {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = 0;
		int alcool = 0, gasolina = 0, diesel = 0;
		
		System.out.println("1 - Álcool | 2 - Gasolina | 3 - Diesel | 4 - Fim");
		
		while(true) {
			
			n = sc.nextInt();
			
			if(n == 4) {
				System.out.println("Obrigado");
				break;
			}
			switch(n) {
			case 1:
				alcool++;
				break;
			case 2:
				gasolina++;
				break;
			case 3:
				diesel++;
				break;
			default:
				System.out.println("Inválido. Digite novamente: ");	
			}	
		}
		System.out.println(alcool);
		System.out.println(gasolina);
		System.out.println(diesel);
		sc.close();
	}

}
