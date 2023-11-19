package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static double PI = 3.14159;

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner scanner = new Scanner(System.in);

		double radius = 0.0;
		double circunference = 0.0;
		double volume = 0.0;

		System.out.print("\nInforme o valor do raio: ");
		radius = scanner.nextDouble();

		circunference = calculateCircunference(radius);
		volume = calculateVolume(radius);

		displayData(circunference, volume);

		scanner.close();

		System.out.println("\n-> fim do programa");
	}

	/*
	 * functions
	 */
	private static double calculateCircunference(double radius) {
		double circunference = 0.0;
		circunference = 2.0 * PI * radius;
		return circunference;
	}

	private static double calculateVolume(double radius) {
		double volume = 0.0;
		volume = (4.0 * PI * Math.pow(radius, 3)) / 3.0;
		return volume;
	}

	private static void displayData(double circunference, double volume) {
		System.out.printf("\nCircunferência:   %.2f%n", circunference);
		System.out.printf("Volume:           %.2f%n", volume);
		System.out.printf("PI:               %.2f%n", PI);
	}
}
