package entities;

public abstract class Shape {
	
	private String Color;
	
	public Shape() {
		
	}

	public Shape(String color) {
		Color = color;
	}

	public String getColor() {
		return Color;
	}

	public void setColor(String color) {
		Color = color;
	}
	
	public abstract Double area();
}