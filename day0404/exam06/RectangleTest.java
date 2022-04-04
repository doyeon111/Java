package exam06;

public class RectangleTest {

	public static void main(String[] args) {
		
		Rectangle r1 = new Rectangle();
		Rectangle r2 = new Rectangle(40, 30);
		Rectangle r3 = new Rectangle("w", 40);
		Rectangle r4 = new Rectangle("l", 40);
		
		System.out.println("가로: " + r1.getWidth() + " 세로: " + r1.getLength() + " 넓이: " + r1.calcArea());
		System.out.println("가로: " + r2.getWidth() + " 세로: " + r2.getLength() + " 넓이: " + r2.calcArea());
		System.out.println("가로: " + r3.getWidth() + " 세로: " + r3.getLength() + " 넓이: " + r3.calcArea());
		System.out.println("가로: " + r4.getWidth() + " 세로: " + r4.getLength() + " 넓이: " + r4.calcArea());

	}

}
