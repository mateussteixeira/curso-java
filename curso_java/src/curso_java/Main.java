package curso_java;

import curso_java.entitys.TriangleEntity;

import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		TriangleEntity triangle1 = new TriangleEntity(sc.nextInt(), sc.nextInt(), sc.nextInt());
		TriangleEntity triangle2 = new TriangleEntity(sc.nextInt(), sc.nextInt(), sc.nextInt());

		System.out.println("Area x: " + Double.toString(triangle1.calcularArea()));
		System.out.println("Area y: " + Double.toString(triangle2.calcularArea()));
		System.out.println(triangle1.calcularArea() > triangle2.calcularArea() ? "Area x é maior: " + Double.toString(triangle1.calcularArea()) : 
			"Area y é maior: " + Double.toString(triangle2.calcularArea()));
	}
}