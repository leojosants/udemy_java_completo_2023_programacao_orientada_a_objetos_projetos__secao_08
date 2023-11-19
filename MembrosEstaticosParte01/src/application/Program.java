package application;

import java.util.Locale;
import java.util.Scanner;

import util.Calculator;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner scanner = new Scanner(System.in);
		Calculator calculator = new Calculator();

		double radius = 0.0;
		double circunference = 0.0;
		double volume = 0.0;

		radius = requestRadius(scanner);
		circunference = calculator.calculateCircunference(radius);
		volume = calculator.calculateVolume(radius);

		displayData(circunference, volume, calculator);

		scanner.close();

		System.out.println("\n-> fim do programa");
	}

	/*
	 * functions
	 */
	private static double requestRadius(Scanner scanner) {
		double radius = 0.0;

		do {
			System.out.print("\nInforme o valor do raio: ");
			radius = scanner.nextDouble();

			while (radius <= 0) {
				System.out.print("-> campo 'valor do raio' não pode ser menor ou igual a 0: ");
				radius = scanner.nextDouble();
			}
		} while (radius <= 0);

		return radius;
	}

	private static void displayData(double circunference, double volume, Calculator calculator) {
		System.out.printf("\nCircunferência:   %.2f%n", circunference);
		System.out.printf("Volume:           %.2f%n", volume);
		System.out.printf("PI:               %.2f%n", calculator.PI);
	}
}
