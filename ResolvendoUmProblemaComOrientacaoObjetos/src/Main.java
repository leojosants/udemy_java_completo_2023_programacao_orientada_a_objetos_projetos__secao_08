import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner scanner = new Scanner(System.in);

		Triangle triangle_x = new Triangle();
		Triangle triangle_y = new Triangle();

		System.out.println("\nInforme a medida dos lados de dois triângulos X e Y\n");

		System.out.println("Medidas do Triângulo X");
		triangle_x.side_a = requestMeasurements(scanner, 'a', 'x');
		triangle_x.side_b = requestMeasurements(scanner, 'b', 'x');
		triangle_x.side_c = requestMeasurements(scanner, 'c', 'x');

		System.out.println("\nMedidas do Triângulo Y");
		triangle_y.side_a = requestMeasurements(scanner, 'a', 'y');
		triangle_y.side_b = requestMeasurements(scanner, 'b', 'y');
		triangle_y.side_c = requestMeasurements(scanner, 'c', 'y');

		double areaOfTriangle_x = calculateArea(triangle_x.side_a, triangle_x.side_b, triangle_x.side_c);
		double areaOfTriangle_y = calculateArea(triangle_y.side_a, triangle_y.side_b, triangle_y.side_c);
		String triangleWithLargestArea = checkTheLargestArea(areaOfTriangle_x, areaOfTriangle_y);

		displayData(areaOfTriangle_x, areaOfTriangle_y, triangleWithLargestArea);

		scanner.close();
		System.out.println("\n-> fim do programa");
	}

	/*
	 * functions
	 */
	private static double requestMeasurements(Scanner scanner, char whichMeasure, char whichTriangle) {
		double side_a = 0.0;
		double side_b = 0.0;
		double side_c = 0.0;

		if (whichTriangle == 'x') {
			if (whichMeasure == 'a') {
				System.out.print("Digite a medida do lado A: ");
				return side_a = scanner.nextDouble();

			} else if (whichMeasure == 'b') {
				System.out.print("Digite a medida do lado B: ");
				return side_b = scanner.nextDouble();

			} else if (whichMeasure == 'c') {
				System.out.print("Digite a medida do lado C: ");
				return side_c = scanner.nextDouble();
			}

		} else if (whichTriangle == 'y') {
			if (whichMeasure == 'a') {
				System.out.print("Digite a medida do lado A: ");
				return side_a = scanner.nextDouble();

			} else if (whichMeasure == 'b') {
				System.out.print("Digite a medida do lado B: ");
				return side_b = scanner.nextDouble();

			} else if (whichMeasure == 'c') {
				System.out.print("Digite a medida do lado C: ");
				return side_c = scanner.nextDouble();
			}
		}
		return 0;
	}

	private static double calculateArea(double side_a, double side_b, double side_c) {
		double area = 0.0;
		double p = (side_a + side_b + side_c) / 2;
		area = Math.sqrt((p * (p - side_a)) * (p - side_b) * (p - side_c));
		return area;
	}

	private static String checkTheLargestArea(double areaOfTriangle_x, double areaOfTriangle_y) {
		double largestArea = 0.0;
		String triangleWithLargestArea = "";

		largestArea = Math.max(areaOfTriangle_x, areaOfTriangle_y);

		if (largestArea == areaOfTriangle_x) {
			triangleWithLargestArea = "X";

		} else if (largestArea == areaOfTriangle_y) {
			triangleWithLargestArea = "Y";
		}

		return triangleWithLargestArea;
	}

	private static void displayData(double areaOfTriangle_x, double areaOfTriangle_y, String triangleWithLargestArea) {
		System.out.println("\nExibindo dados");
		System.out.printf("Área do triângulo X: %.4f%n", areaOfTriangle_x);
		System.out.printf("Área do triângulo Y: %.4f%n", areaOfTriangle_y);
		System.out.printf("Triângulo com maior área: %s%n", triangleWithLargestArea);
	}
}