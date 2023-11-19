
import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner scanner = new Scanner(System.in);
		Rectangle rectangle = new Rectangle();

		requestWidth(scanner, rectangle);
		requestHeight(scanner, rectangle);

		double area = rectangle.calculateArea();
		double perimeter = rectangle.calculatePerimeter();
		double diagonal = rectangle.calculateDiagonal();

		displayData(area, perimeter, diagonal);

		scanner.close();

		System.out.println("\n-> fim do programa");
	}

	/*
	 * functions
	 */
	private static void requestWidth(Scanner scanner, Rectangle rectangle) {
		double width = 0.0;
		System.out.print("\nInforme a largura do retângulo: ");
		width = scanner.nextDouble();
		rectangle.width = width;
	}

	private static void requestHeight(Scanner scanner, Rectangle rectangle) {
		double height = 0.0;
		System.out.print("Informe a altura  do retângulo: ");
		height = scanner.nextDouble();
		rectangle.height = height;
	}

	private static void displayData(double area, double perimeter, double diagonal) {
		System.out.println("\nExibindo dados");
		System.out.printf("Área:      %.2f%n", area);
		System.out.printf("Perímetro: %.2f%n", perimeter);
		System.out.printf("Diagonal:  %.2f%n", diagonal);
	}
}
