package entities;

public class Product {
	
	public String name;
	public double price;
	public int quantity;
	
	// delegação de função: multiplicar o valor do preço * quantidade
	public double totalValueInStock() {
		return price * quantity;
	}
	
	public void addProducts(int quantity) {
		this.quantity += quantity; //this: acessa o atributo da classe
	}
	
	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}
	
	public String toString() { // sobrepondo a operação padrão do toString que já vem no Object
		return name
				+ ", R$ "
				+ String.format("%.2f", price)
				+ ", " 
				+ quantity
				+ " units, Total: R$ "
				+ String.format("%.2f", totalValueInStock());
	}

}
