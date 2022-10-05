package curso.application;

import java.util.Scanner;

import entities.Rectangle;

public class Main {
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		Rectangle rectangle = new Rectangle(sc.nextDouble(), sc.nextDouble());
		
		System.out.println("AREA = " + rectangle.getArea());
		System.out.println("PERIMETER = " + rectangle.getPerimeter());
		System.out.println("DIAGONAL = " + rectangle.getDiagonal());
		
	}
	
}
