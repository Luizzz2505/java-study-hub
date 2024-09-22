package entities;

public class Rectangle {
	
	public double width;
	public double height;
	
	public double areaRectangle() {
		return width * height;
	}
	
	public double perimeterRectangle(double p) {
		 return p = 2 * (width + height);
	}
	
	public double diagonalRectangle(double d) {
		return d = Math.sqrt(Math.pow(width, 2.00) + Math.pow(height, 2.00));
	}
}
