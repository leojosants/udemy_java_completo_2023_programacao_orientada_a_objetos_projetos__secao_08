package entities;

public class Product {
	/*
	 * attribute
	 */
	public String name;
	public double price;
	public int quantity;

	/*
	 * methods
	 */
	public double totalValueInStock() {
		return price * quantity;
	}

	public void addProducts(int quantity) {
		this.quantity += quantity;
	}

	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}
}
