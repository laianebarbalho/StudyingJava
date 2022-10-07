package NelioAlvesDH;
import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;
import entities.Triangle;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Triangle x, y;
		
		x = new Triangle();
		y = new Triangle();
		
		System.out.println("Digite as medidas dos lados do triangulo x: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		
		System.out.println("Digite as medidas dos lados do triangulo y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		
		
		double areaX = x.areaTriangle();
		
		
		double areaY = y.areaTriangle();
		
		
		System.out.printf("A área do triangulo X é: %.4f%n", areaX);
		System.out.printf("A área do triangulo Y é: %.4f%n", areaY);
		
		Rectangle a, b;
		
		a = new Rectangle();
		
		System.out.println("Enter rectangle width and height: ");
		a.base = sc.nextDouble();
		a.height = sc.nextDouble();
		
		System.out.printf("AREA = %.2f%n", a.areaRectangle());
		System.out.printf("PERIMETER = %.2f%n", a.perimeter());
		System.out.printf("DIAGONAL = %.2f%n", a.diagonal());
		
		
		
	}

}
