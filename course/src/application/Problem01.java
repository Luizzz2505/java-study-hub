package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class Problem01 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rectangle rectangle = new Rectangle();
		System.out.println("Enter rectangle width and height: ");
		rectangle.width = sc.nextDouble();
		rectangle.height = sc.nextDouble();
		
		System.out.printf("Area: %.2f%n", rectangle.areaRectangle());
		System.out.printf("Perimeter: %.2f%n", rectangle.perimeterRectangle(0));
		System.out.printf("Diagonal: %.2f%n", rectangle.diagonalRectangle(0));
		
		sc.close();
	}

}
