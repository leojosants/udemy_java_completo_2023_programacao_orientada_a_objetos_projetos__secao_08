package application;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner scanner = new Scanner(System.in);

		double dollarPrice = 0.0;
		double amountOfDollarsToBePurchased = 0.0;
		double resultOfTheConversation = 0.0;

		dollarPrice = requestDollarPrice(scanner);
		
		amountOfDollarsToBePurchased = requestAmountOfDollarsToBePurchased(scanner);
		
		resultOfTheConversation = CurrencyConverter.dollarToReal(amountOfDollarsToBePurchased, dollarPrice);

		displayData(resultOfTheConversation);

		scanner.close();

		System.out.println("\n-> fim do programa");
	}

	/*
	 * functions
	 */
	private static double requestDollarPrice(Scanner scanner) {
		double dollarPrice = 0.0;

		do {
			System.out.print("\nQual � o pre�o do d�lar? $ ");
			dollarPrice = scanner.nextDouble();

			while (dollarPrice <= 0) {
				System.out.print("-> campo 'pre�o do d�lar' n�o pode ser igual ou menor que 0: $ ");
				dollarPrice = scanner.nextDouble();
			}
		} while (dollarPrice <= 0);

		return dollarPrice;
	}

	private static double requestAmountOfDollarsToBePurchased(Scanner scanner) {
		double amountOfDollarsToBePurchased = 0.0;

		do {
			System.out.print("\nQuantos d�lares ser�o comprados? R$ ");
			amountOfDollarsToBePurchased = scanner.nextDouble();

			while (amountOfDollarsToBePurchased <= 0) {
				System.out.print("-> campo 'quantos d�lares ser�o comprados?' n�o pode ser igual ou menor que 0: R$ ");
				amountOfDollarsToBePurchased = scanner.nextDouble();
			}
		} while (amountOfDollarsToBePurchased <= 0);

		return amountOfDollarsToBePurchased;
	}

	private static void displayData(double resultOfTheConversation) {
		System.out.printf("\nValor a ser pago em reais: R$ %.2f%n", resultOfTheConversation);
	}
}
