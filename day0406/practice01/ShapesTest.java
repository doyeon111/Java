package practice01;

abstract class Shapes {
	protected int x, y;
	protected double area;
	
	public abstract void calArea(); //�ڽ� Ŭ������ ���� ������ �ϵ��� ����

	public Shapes(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return " [x=" + x + ", y=" + y + ", area=" + area + "]";
	}
	
	
	
	
}

class Square extends Shapes {
	
	private double width, height;

	public Square(int x, int y, double width, double height) {
		super(x, y);
		this.width = width;
		this.height = height;
	}

	@Override
	public void calArea() {
		area = width * height;
		
	}

	@Override
	public String toString() {
		return "Square [width=" + width + ", height=" + height + ", x=" + x + ", y=" + y + ", area=" + area + "]";
	}

	
	
	
}

class Circle extends Shapes {
	private double r;

	public Circle(int x, int y, double r) {
		super(x, y);
		this.r = r;
	}

	@Override
	public void calArea() {
		//area = r * r * 3.141592;
		area = Math.PI * Math.pow(r, 2); //���̿� ������ �޼ҵ�� ����� �� ����.(��ü ������� �ʰ� �� �� ����.)
		
	}

	@Override
	public String toString() {
		return "Circle [r=" + r + ", " + super.toString() + "]";
	}
	
	
	
}

class Triangle extends Shapes {
	private double width, height;

	public Triangle(int x, int y, double width, double height) {
		super(x, y);
		this.width = width;
		this.height = height;
	}

	@Override
	public void calArea() {
		area = width * height / 2;
		
	}

	@Override
	public String toString() {
		return "Triangle [width=" + width + ", height=" + height + ", " + super.toString() + "]"; //�θ� ���� toString�� ������.
	}
	
	
	
}

public class ShapesTest {

	public static void main(String[] args) {
		Square s = new Square(10, 10, 50, 20);
		Circle c = new Circle(10, 100, 20);
		Triangle t = new Triangle(10, 50, 50, 20);
		
		s.calArea();
		c.calArea();
		t.calArea();
		
		System.out.println(s);
		System.out.println(c);
		System.out.println(t);
		
	}

}
