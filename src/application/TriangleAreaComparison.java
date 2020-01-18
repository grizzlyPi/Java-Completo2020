package application;
import java.util.Locale;
import java.util.Scanner; // class that defines structure

import entities.Triangle; 

public class TriangleAreaComparison {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double areaX, areaY;
	
		Triangle x, y;
		
		/******************************************************************
		 * "object" and "instance" are the same thing. There is a "class" *
		 * that defines structure, and instances of that class 			  *
		 * (obtained with new ClassName())				   				  *	
		 *****************************************************************/	
		
		/******************************************************************
		* variable x stores a reference to an object of type Triangle	  *
		* reference is a "link" to an Object.                             *
		******************************************************************/
		x = new Triangle();
		y = new Triangle();
		///////////////////////////////////////////////////////////////////
		
		System.out.println("Enter the measures of triangle X:");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		
		System.out.println("Enter the measures of triangle Y:");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		/**************************************************************************************
		 * A method is a block of code which only runs when it is called.                     *
		 * You can pass data, known as parameters, into a method.                             *
		 * Methods are used to perform certain actions, and they are also known as functions. *
		 * Why use methods? To reuse code: define the code once, and use it many times.       *
		 **************************************************************************************/
		areaX = x.area();
		areaY = y.area();
		////////////////////////////////////////////////////////////////////////////////////////
		
		System.out.printf("Triangle x area: %.2f%n", areaX);
		System.out.printf("Triangle Y area: %.2f%n", areaY);
		
		if (areaX > areaY) {
			System.out.printf("Larger area: %.2f%n", areaX);
		} else {
			System.out.printf("Larger area: %.2f%n", areaY);
		}
		
		sc.close();
	}
	
}