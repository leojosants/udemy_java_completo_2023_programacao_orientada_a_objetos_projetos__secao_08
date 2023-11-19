import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner scanner = new Scanner(System.in);
		Product product = new Product();

		System.out.println("\nEntre com os dados do produto");

		product.name = requestName(scanner);
		product.price = requestPrice(scanner);
		product.quantity = requestQuantity(scanner);

		displayData(product);
		requestQuantityOfProductToAddInStock(scanner, product);
		displayData(product);
		requestQuantityOfProductToRemoveFromStock(scanner, product);
		displayData(product);
	
		scanner.close();
		
		System.out.println("-> fim do programa");
	}

	/*
	 * functions
	 */
	private static String requestName(Scanner scanner) {
		String name = "";
		System.out.print("Nome do produto: ");
		name = scanner.nextLine().toUpperCase().trim();
		return name;
	}

	private static double requestPrice(Scanner scanner) {
		double price = 0.0;
		System.out.print("Preço do produto: ");
		price = scanner.nextDouble();
		return price;
	}

	private static int requestQuantity(Scanner scanner) {
		int quantity = 0;
		System.out.print("Quantidade do produto: ");
		quantity = scanner.nextInt();
		return quantity;
	}

	private static void displayData(Product product) {
		System.out.println("\nExibindo dados do Produto");
		System.out.println(product.toString());
	}

	private static void requestQuantityOfProductToAddInStock(Scanner scanner, Product product) {
		System.out.print("Entre com a quantidade de produtos a ser adicionado no estoque: ");
		int quantityToBeAdded = scanner.nextInt();
		product.addProducts(quantityToBeAdded);
	}

	private static void requestQuantityOfProductToRemoveFromStock(Scanner scanner, Product product) {
		System.out.print("Entre com a quantidade de produtos a ser removido no estoque: ");
		int quantityToBeRemoved = scanner.nextInt();
		product.removeProducts(quantityToBeRemoved);
	}
}
