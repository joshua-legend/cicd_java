package Day03.supermarket;

public class Product {
	private String name;
	private Integer price;
	
	public Product(String name, Integer price) {
		this.name = name;
		this.price = price;
	}
	
	public Integer getPrice() {
		return price;
	}
	
	void info() {
		System.out.println("상품명: " + this.name + " 상품 가격:" + this.price);
	}
	
}
