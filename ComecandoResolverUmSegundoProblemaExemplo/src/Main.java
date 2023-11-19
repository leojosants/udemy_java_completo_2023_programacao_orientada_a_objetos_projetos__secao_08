import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner scanner = new Scanner(System.in);
		Product product = new Product();

		System.out.println("\nEntre com os dados do produto");

		System.out.print("Nome do produto: ");
		product.name = scanner.nextLine().toUpperCase().trim();

		System.out.print("Preço do produto: ");
		product.price = scanner.nextDouble();

		System.out.print("Quantidade do produto: ");
		product.quantity = scanner.nextInt();

		System.out.println("\nMostrando dados do Produto");
		System.out.println(product.toString());

		System.out.print("Entre com a quantidade de produtos a ser adicionado no estoque: ");
		int quantityToBeAdded = scanner.nextInt();
		product.addProducts(quantityToBeAdded);

		System.out.println("\nAtualização de estoque");
		System.out.println(product.toString());

		System.out.print("Entre com a quantidade de produtos a ser removido no estoque: ");
		int quantityToBeRemoved = scanner.nextInt();
		product.removeProducts(quantityToBeRemoved);

		System.out.println("\nAtualização de estoque");
		System.out.println(product.toString());

		scanner.close();
		System.out.println("-> fim do programa");
	}

}
