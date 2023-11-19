
import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner scanner = new Scanner(System.in);
		Student student = new Student();

		student.name = requestName(scanner);
		student.firstQuarterGrade = requestFirstQuarterGrade(scanner);
		student.secondQuarterGrade = requestSecondQuarterGrade(scanner);
		student.thirdQuarterGrade = requestThirdQuarterGrade(scanner);
		student.finalSituation();

		scanner.close();

		System.out.println("\n-> fim do programa");
	}

	/*
	 * functions
	 */
	private static String requestName(Scanner scanner) {
		String name = "";

		do {
			System.out.print("\nInforme o nome do aluno: ");
			name = scanner.nextLine().trim();

			while (name.equals("")) {
				System.out.print("-> campo 'nome do aluno' não pode ser em branco: ");
				name = scanner.nextLine().trim();
			}
		} while (name.equals(""));

		return name;
	}

	private static double requestFirstQuarterGrade(Scanner scanner) {
		double firstQuarterGrade = 0.0;

		do {
			System.out.print("\nInforme a nota do primeiro trimestre: ");
			firstQuarterGrade = scanner.nextDouble();

			while ((firstQuarterGrade <= 0) || (firstQuarterGrade > 30)) {
				System.out.print(
						"-> campo 'nota do primeiro trimestre' não pode ser menor ou igual a 0 e nem maior que 30: ");
				firstQuarterGrade = scanner.nextDouble();
			}
		} while ((firstQuarterGrade <= 0) || (firstQuarterGrade > 30));

		return firstQuarterGrade;
	}

	private static double requestSecondQuarterGrade(Scanner scanner) {
		double secondQuarterGrade = 0.0;

		do {
			System.out.print("\nInforme a nota do segundo trimestre: ");
			secondQuarterGrade = scanner.nextDouble();

			while ((secondQuarterGrade <= 0) || (secondQuarterGrade > 35)) {
				System.out.print(
						"-> campo 'nota do segundo trimestre' não pode ser menor ou igual a 0 e nem maior que 35: ");
				secondQuarterGrade = scanner.nextDouble();
			}
		} while ((secondQuarterGrade <= 0) || (secondQuarterGrade > 35));

		return secondQuarterGrade;
	}

	private static double requestThirdQuarterGrade(Scanner scanner) {
		double thirdQuarterGrade = 0.0;

		do {
			System.out.print("\nInforme a nota do terceiro trimestre: ");
			thirdQuarterGrade = scanner.nextDouble();

			while ((thirdQuarterGrade <= 0) || (thirdQuarterGrade > 35)) {
				System.out.print(
						"-> campo 'nota do terceiro trimestre' não pode ser menor ou igual a 0 e nem maior que 35: ");
				thirdQuarterGrade = scanner.nextDouble();
			}
		} while ((thirdQuarterGrade <= 0) || (thirdQuarterGrade > 35));

		return thirdQuarterGrade;
	}
}
