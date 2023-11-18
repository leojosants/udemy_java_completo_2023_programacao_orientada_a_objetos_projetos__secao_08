import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner scanner = new Scanner(System.in);

		System.out.println("\nInforme a medida dos lados de dois triângulos X e Y\n");

		System.out.println("Medidas do Triângulo X");
		double medidaADotriangulo_x = solicitarMedidas(scanner, 'a', 'x');
		double medidaBDoTriangulo_x = solicitarMedidas(scanner, 'b', 'x');
		double medidaCDoTriangulo_x = solicitarMedidas(scanner, 'c', 'x');

		System.out.println("\nMedidas do Triângulo Y");
		double medidaADotriangulo_y = solicitarMedidas(scanner, 'a', 'y');
		double medidaBDoTriangulo_y = solicitarMedidas(scanner, 'b', 'y');
		double medidaCDoTriangulo_y = solicitarMedidas(scanner, 'c', 'y');

		double areaDoTriangulo_x = calcularArea(medidaADotriangulo_x, medidaBDoTriangulo_x, medidaCDoTriangulo_x);
		double areaDoTriangulo_y = calcularArea(medidaADotriangulo_y, medidaBDoTriangulo_y, medidaCDoTriangulo_y);
		String trianguloComMaiorArea = verificaMiorArea(areaDoTriangulo_x, areaDoTriangulo_y);

		exibirDados(areaDoTriangulo_x, areaDoTriangulo_y, trianguloComMaiorArea);

		scanner.close();
		System.out.println("\n-> fim do programa");
	}

	/*
	 * functions
	 */
	private static double solicitarMedidas(Scanner scanner, char qualMedida, char qualTriangulo) {
		double medida_a = 0.0;
		double medida_b = 0.0;
		double medida_c = 0.0;

		if (qualTriangulo == 'x') {
			if (qualMedida == 'a') {
				System.out.print("Digite a medida do lado A: ");
				return medida_a = scanner.nextDouble();

			} else if (qualMedida == 'b') {
				System.out.print("Digite a medida do lado B: ");
				return medida_b = scanner.nextDouble();

			} else if (qualMedida == 'c') {
				System.out.print("Digite a medida do lado C: ");
				return medida_c = scanner.nextDouble();
			}

		} else if (qualTriangulo == 'y') {
			if (qualMedida == 'a') {
				System.out.print("Digite a medida do lado A: ");
				return medida_a = scanner.nextDouble();

			} else if (qualMedida == 'b') {
				System.out.print("Digite a medida do lado B: ");
				return medida_b = scanner.nextDouble();

			} else if (qualMedida == 'c') {
				System.out.print("Digite a medida do lado C: ");
				return medida_c = scanner.nextDouble();
			}
		}
		return 0;
	}

	private static double calcularArea(double medida_a, double medida_b, double medida_c) {
		double area = 0.0;
		double p = (medida_a + medida_b + medida_c) / 2;
		area = Math.sqrt((p * (p - medida_a)) * (p - medida_b) * (p - medida_c));
		return area;
	}
	
	private static String verificaMiorArea(double areaDoTriangulo_x, double areaDoTriangulo_y) {
		double maiorArea = 0.0;
		String trianguloComMaiorArea = "";

		maiorArea = Math.max(areaDoTriangulo_x, areaDoTriangulo_y);

		if (maiorArea == areaDoTriangulo_x) {
			trianguloComMaiorArea = "X";

		} else if (maiorArea == areaDoTriangulo_y) {
			trianguloComMaiorArea = "Y";
		}

		return trianguloComMaiorArea;
	}

	private static void exibirDados(double areaDoTriangulo_x, double areaDoTriangulo_y, String trianguloComMaiorArea) {
		System.out.println("\nExibindo dados");
		System.out.printf("Área do triângulo X: %.4f%n", areaDoTriangulo_x);
		System.out.printf("Área do triângulo Y: %.4f%n", areaDoTriangulo_y);
		System.out.printf("Triângulo com maior área: %s%n",trianguloComMaiorArea);
	}
}