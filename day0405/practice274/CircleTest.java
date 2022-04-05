package practice274;

class Circle {
	protected int radius;

	public Circle(int r) {
		radius = r;
	}

	public Circle() {
		super();
		// TODO Auto-generated constructor stub

	}

}

class Pizza extends Circle {
	private String name;

	public Pizza(String name, int r) {
		super(r);
		this.name = name;
	}

	public void print() {
		System.out.println("������ ����:" + name + ", ������ ũ��: " + radius); 
	}

}

public class CircleTest {

	public static void main(String[] args) {
		Pizza obj = new Pizza("Pepperoni", 20);

		obj.print();

	}

}
