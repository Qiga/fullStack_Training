package 상품관리;

public class Product {
	private String name;
	private int unitPrice;
	private int amount;
	
	public Product(String name, int unitPrice, int amount) {
		this.name = name; //물건 이름
		this.unitPrice = unitPrice;
		this.amount = amount;
	}

	public String getName() {
		return name;
	}

	public int getUnitPrice() {
		return unitPrice;
	}

	public int getAmount() {
		return amount;
	}

	
}
