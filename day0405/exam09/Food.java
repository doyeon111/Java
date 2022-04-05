package exam09;

public class Food {
	protected double kcal, weight;
	protected int price;

	public Food(double kcal, int price, double weight) {
		super();
		this.kcal = kcal;
		this.price = price;
		this.weight = weight;
	}

	public Food() {
		super();
		// TODO Auto-generated constructor stub
	}

	public double getKcal() {
		return kcal;
	}

	public void setKcal(double kcal) {
		this.kcal = kcal;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	
	public String getInfo() { //문자열로 반환
		return "칼로리: " + kcal + ", 가격: " + price + ", 중량: " + weight;
	}
	
}


