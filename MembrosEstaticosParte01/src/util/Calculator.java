package util;

public class Calculator {

	public final double PI = 3.14159;

	/*
	 * methods
	 */
	public double calculateCircunference(double radius) {
		double circunference = 0.0;
		circunference = 2.0 * PI * radius;
		return circunference;
	}

	public double calculateVolume(double radius) {
		double volume = 0.0;
		volume = (4.0 * PI * Math.pow(radius, 3)) / 3.0;
		return volume;
	}
}
