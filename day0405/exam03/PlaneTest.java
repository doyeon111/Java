package exam03;

class Plane {
	private String company, model;
	private int max;
	
	//Ŭ���� ������ ��ü�� �����ϰ� Ŭ���� �̸����� �����ؾ� �ϱ� ������ public���� �����.
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
		planes++; //�����Ǵ� ���̱� ������ ������ �� ������ �ϳ��� ������Ų��.
	}

	public Plane() {
		super();
		planes++;
	}
	
	public static int getPlanes() {
		return planes; // static������ ������ �����ϴ�.
	}

}

public class PlaneTest {

	public static void main(String[] args) {
		System.out.println("������� ������� ��: " + Plane.getPlanes());
		Plane p1 = new Plane();
		Plane p2 = new Plane("�������", "A380", 500);

		
		System.out.println(
				"���ۻ�: " + p1.getCompany() + "\t" + "��: " + p1.getModel() + "\t" + "�°� ��: " + p1.getMax() + "\t");

		System.out.println("���ۻ�: " + p2.getCompany() + "\t" + "��: " + p2.getModel() + "\t" + "�°� ��: " + p2.getMax()
				+ "\t");
		
		p1.setCompany("����");
		p1.setModel("����747");
		p1.setMax(300);
		
		System.out.println("-------------------------------------------------------------");
		
		System.out.println(
				"���ۻ�: " + p1.getCompany() + "\t" + "��: " + p1.getModel() + "\t" + "�°� ��: " + p1.getMax() + "\t");
		System.out.println("���ۻ�: " + p2.getCompany() + "\t" + "��: " + p2.getModel() + "\t" + "�°� ��: " + p2.getMax()
		+ "\t");
		
		System.out.println("������� ������� ��: " + Plane.getPlanes());
	}

}
