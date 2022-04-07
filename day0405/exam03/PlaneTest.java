package exam03;

class Plane {
	private String company, model;
	private int max;
	
	//클래스 변수는 객체와 무관하게 클래스 이름으로 접근해야 하기 때문에 public으로 만든다.
	public static int planes;

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getMax() {
		return max;
	}

	public void setMax(int max) {
		this.max = max;
	}

	public Plane(String company, String model, int max) {
		super();
		this.company = company;
		this.model = model;
		this.max = max;
		planes++; //생성되는 곳이기 때문에 생성될 때 개수를 하나씩 증가시킨다.
	}

	public Plane() {
		super();
		planes++;
	}
	
	public static int getPlanes() {
		return planes; // static에서만 접근이 가능하다.
	}

}

public class PlaneTest {

	public static void main(String[] args) {
		System.out.println("만들어진 비행기의 수: " + Plane.getPlanes());
		Plane p1 = new Plane();
		Plane p2 = new Plane("에어버스", "A380", 500);

		
		System.out.println(
				"제작사: " + p1.getCompany() + "\t" + "모델: " + p1.getModel() + "\t" + "승객 수: " + p1.getMax() + "\t");

		System.out.println("제작사: " + p2.getCompany() + "\t" + "모델: " + p2.getModel() + "\t" + "승객 수: " + p2.getMax()
				+ "\t");
		
		p1.setCompany("보잉");
		p1.setModel("보잉747");
		p1.setMax(300);
		
		System.out.println("-------------------------------------------------------------");
		
		System.out.println(
				"제작사: " + p1.getCompany() + "\t" + "모델: " + p1.getModel() + "\t" + "승객 수: " + p1.getMax() + "\t");
		System.out.println("제작사: " + p2.getCompany() + "\t" + "모델: " + p2.getModel() + "\t" + "승객 수: " + p2.getMax()
		+ "\t");
		
		System.out.println("만들어진 비행기의 수: " + Plane.getPlanes());
	}

}
