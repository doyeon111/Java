package exam09;

public class Melon extends Food {
	private String grand;

	public Melon(double kcal, int price, double weight, String grand) {
		super(kcal, price, weight);
		this.grand = grand;
	}

	public Melon() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Melon(double kcal, int price, double weight) {
		super(kcal, price, weight);
		// TODO Auto-generated constructor stub
	}

	public String getGrand() {
		return grand;
	}

	public void setGrand(String grand) {
		this.grand = grand;
	}
	
	public String getInfo() {//부모클래스와 다르기 때문에 재정의 해준다.
		return "칼로리: " + kcal + ", 가격: " + price + ", 중량: " + weight + ", 경작농원: " + grand;
	}
	
	
}
