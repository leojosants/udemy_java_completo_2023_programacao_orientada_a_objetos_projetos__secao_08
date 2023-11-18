import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner scanner = new Scanner(System.in);

		System.out.println("\nInforme a medida dos lados de dois triângulos X e Y\n");

		System.out.println("Medidas do Triângulo X");
		double measureOfSideAOfTheTriangle_x = requestMeasurements(scanner, 'a', 'x');
		double measureOfSideBOfTheTriangle_x = requestMeasurements(scanner, 'b', 'x');
		double measureOfSideCOfTheTriangle_x = requestMeasurements(scanner, 'c', 'x');

		System.out.println("\nMedidas do Triângulo Y");
		double measureOfSideAOfTheTriangle_y = requestMeasurements(scanner, 'a', 'y');
		double measureOfSideBOfTheTriangle_y = requestMeasurements(scanner, 'b', 'y');
		double measureOfSideCOfTheTriangle_y = requestMeasurements(scanner, 'c', 'y');

		double areaOfTriangle_x = calculateArea(measureOfSideAOfTheTriangle_x, measureOfSideBOfTheTriangle_x, measureOfSideCOfTheTriangle_x);
		double areaOfTriangle_y = calculateArea(measureOfSideAOfTheTriangle_y, measureOfSideBOfTheTriangle_y, measureOfSideCOfTheTriangle_y);
		String triangleWithLargestArea = checkTheLargestArea(areaOfTriangle_x, areaOfTriangle_y);

		displayData(areaOfTriangle_x, areaOfTriangle_y, triangleWithLargestArea);

		scanner.close();
		System.out.println("\n-> fim do programa");
	}

	/*
	 * functions
	 */
	private static double requestMeasurements(Scanner scanner, char whichMeasure, char whichTriangle) {
		double measure_a = 0.0;
		double measure_b = 0.0;
		double measure_c = 0.0;

		if (whichTriangle == 'x') {
			if (whichMeasure == 'a') {
				System.out.print("Digite a medida do lado A: ");
				return measure_a = scanner.nextDouble();

			} else if (whichMeasure == 'b') {
				System.out.print("Digite a medida do lado B: ");
				return measure_b = scanner.nextDouble();

			} else if (whichMeasure == 'c') {
				System.out.print("Digite a medida do lado C: ");
				return measure_c = scanner.nextDouble();
			}

		} else if (whichTriangle == 'y') {
			if (whichMeasure == 'a') {
				System.out.print("Digite a medida do lado A: ");
				return measure_a = scanner.nextDouble();

			} else if (whichMeasure == 'b') {
				System.out.print("Digite a medida do lado B: ");
				return measure_b = scanner.nextDouble();

			} else if (whichMeasure == 'c') {
				System.out.print("Digite a medida do lado C: ");
				return measure_c = scanner.nextDouble();
			}
		}
		return 0;
	}

	private static double calculateArea(double measure_a, double measure_b, double measure_c) {
		double area = 0.0;
		double p = (measure_a + measure_b + measure_c) / 2;
		area = Math.sqrt((p * (p - measure_a)) * (p - measure_b) * (p - measure_c));
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
		System.out.printf("Triângulo com maior área: %s%n",triangleWithLargestArea);
	}
}