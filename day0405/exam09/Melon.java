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
	
	public String getInfo() {//�θ�Ŭ������ �ٸ��� ������ ������ ���ش�.
		return "Į�θ�: " + kcal + ", ����: " + price + ", �߷�: " + weight + ", ���۳��: " + grand;
	}
	
	
}
