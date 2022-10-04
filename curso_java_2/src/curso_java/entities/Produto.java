package curso_java.entities;

public class Produto {

	private String name;
	private Double price;
	private int quantity;

	public Produto(String name, Double price, int quantity) {
		this.setName(name);
		this.setPrice(price);
		this.setQuantity(quantity);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double totalValueInStock() {
		return this.getPrice() * this.getQuantity();
	}

	public void addProducts(int quantity) {
		this.setQuantity(this.getQuantity() + quantity);
	}

	public void removeProducts(int quantity) {
		if(this.getQuantity() - quantity < 0) {
			System.out.println("Quantidade menor que zero");
		}else {
			setQuantity(this.getQuantity() - quantity);
		}
	}

}
