package exam06;

public class RectangleTest {

	public static void main(String[] args) {
		
		Rectangle r1 = new Rectangle();
		Rectangle r2 = new Rectangle(40, 30);
		Rectangle r3 = new Rectangle("w", 40);
		Rectangle r4 = new Rectangle("l", 40);
		
		System.out.println("����: " + r1.getWidth() + " ����: " + r1.getLength() + " ����: " + r1.calcArea());
		System.out.println("����: " + r2.getWidth() + " ����: " + r2.getLength() + " ����: " + r2.calcArea());
		System.out.println("����: " + r3.getWidth() + " ����: " + r3.getLength() + " ����: " + r3.calcArea());
		System.out.println("����: " + r4.getWidth() + " ����: " + r4.getLength() + " ����: " + r4.calcArea());

	}

}
