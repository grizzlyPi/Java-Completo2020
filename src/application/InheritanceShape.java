package application;

import java.util.Locale;

import entities.Circle;
import entities.Shape;

public class InheritanceShape {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Shape shape = new Circle("RED", 1.0);
	
		Double area = shape.area();
		
		Circle circle = (Circle) shape;
		
		System.out.println(circle.getColor());;
		
		System.out.println(area);
	}
}
