package entities;

public class Rectangle {
	/*
	 * attributes
	 */
	public double width;
	public double height;

	/*
	 * methods
	 */
	public double calculateArea() {
		double area = 0.0;
		area = this.width * this.height;
		return area;
	}

	public double calculatePerimeter() {
		double perimeter = 0.0;
		perimeter = 2 * (this.width + this.height);
		return perimeter;
	}

	public double calculateDiagonal() {
		double diagonal = 0.0;
		double widthPower = Math.pow(this.width, 2);
		double heightPower = Math.pow(this.height, 2);
		diagonal = Math.sqrt(widthPower + heightPower);
		return diagonal;
	}
}
