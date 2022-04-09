package practice09;

class Product { // 판매되는 물건
	protected String name;
	protected int price; //물건의 가격

	public double getPrice() {
		return price;
	}

	public Product(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + "]"; // + ", getName()=" + getName() + "]";
	}

}

class DiscountProduct extends Product {
	private double discount;
	private double discount_price;

	public DiscountProduct(String name, int price, double discount) {
		super(name, price);
		this.discount = discount;
	}

	@Override
	public double getPrice() {
		discount_price = price - ((price/100)* discount);
		return discount_price;
	
	}

	@Override
	public String toString() {
		return "DiscountProduct [discount=" + discount + ", name=" + name + "]";
	}
	
	
}

public class ProductTest {

	public static void main(String[] args) {
		Product p1 = new Product("toothbrush", 3000);
		Product p2 = new DiscountProduct("toothbrush", 3000, 15);
		System.out.println(p1.getPrice());
		System.out.println(p2.getPrice());
		System.out.println(p1);
		System.out.println(p2);
	}

} 
