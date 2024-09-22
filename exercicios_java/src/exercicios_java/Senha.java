/*Escreva um programa que repita a leitura de uma senha até que ela
 *  seja válida. Para cada leitura de senha
incorreta informada, escrever a mensagem "Senha Invalida". 
Quando a senha for informada corretamente deve ser
impressa a mensagem "Acesso Permitido" e o 
algoritmo encerrado. Considere que a senha correta é o valor 2002.
 * 
 * 
 */
package exercicios_java;

import java.util.Scanner;

public class Senha {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a senha: ");
		int user = sc.nextInt();
		
		int senha = 2002;
		
		while (user != senha) {
			System.out.println("Senha inválida");
			System.out.print("Digite novamente: ");
			user = sc.nextInt();
		}
		
		System.out.println("Acesso liberado!");
		
		sc.close();
		

	}

}
