
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner scanner = new Scanner(System.in);
		Employee employee = new Employee();

		employee.name = requestName(scanner);
		employee.grossSalary = requestGrossSalary(scanner);
		employee.tax = requestTax(scanner);

		displayNameAndNetSalary(employee);

		double percentage = requestPercentage(scanner);

		employee.increaseSalary(percentage);
		
		displayNameAndGrossSalary(employee);

		scanner.close();

		System.out.println("\n-> fim do programa");
	}

	/*
	 * functions
	 */
	private static String requestName(Scanner scanner) {
		String name = "";

		do {
			System.out.print("\nInforme o nome do funcionário: ");
			name = scanner.nextLine().trim();

			while (name.equals("")) {
				System.out.print("-> campo 'nome do funcionário' não pode ser vazio: ");
				name = scanner.nextLine().trim();
			}
		} while (name.equals(""));

		return name;
	}

	private static double requestGrossSalary(Scanner scanner) {
		double grossSalary = 0.0;

		do {
			System.out.print("\nInforme o salário bruto do funcionário: ");
			grossSalary = scanner.nextDouble();

			while (grossSalary <= 0) {
				System.out.print("-> o campo 'salário bruto do funcionário' não pode ser menor ou igual a zero: ");
				grossSalary = scanner.nextDouble();
			}
		} while (grossSalary <= 0);

		return grossSalary;
	}

	private static double requestTax(Scanner scanner) {
		double tax = 0.0;

		do {
			System.out.print("\nInforme o imposto do funcionário: ");
			tax = scanner.nextDouble();

			while (tax <= 0) {
				System.out.print("-> o campo 'imposto do funcionário' não pode ser menor ou igual a zero: ");
				tax = scanner.nextDouble();
			}
		} while (tax <= 0);

		return tax;
	}

	private static void displayNameAndNetSalary(Employee employee) {
		System.out.printf("\nFuncionário: %s, R$ %.2f%n", employee.name, employee.netSalary());
	}

	private static double requestPercentage(Scanner scanner) {
		double percentage = 0.0;

		do {
			System.out.print("\nQual percentual para aumentar o salário? ");
			percentage = scanner.nextDouble();

			while (percentage <= 0) {
				System.out
						.print("-> o campo 'percentual para aumentar o salário' não pode ser menor ou igual a zero: ");
				percentage = scanner.nextDouble();
			}
		} while (percentage <= 0);

		return percentage;
	}
	
	private static void displayNameAndGrossSalary(Employee employee) {
		System.out.printf("\nAtualizado dados: %s, R$ %.2f%n", employee.name, employee.grossSalary);
	}
}
