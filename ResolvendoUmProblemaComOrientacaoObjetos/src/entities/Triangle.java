package entities;

public class Triangle {
	/*
	 * attributes
	 */
	public double side_a;
	public double side_b;
	public double side_c;
	
	/*
	 * methods
	 */
	public  double calculateArea() {
		double area = 0.0;
		double p = (side_a + side_b + side_c) / 2;
		area = Math.sqrt((p * (p - side_a)) * (p - side_b) * (p - side_c));
		return area;
	}
}
