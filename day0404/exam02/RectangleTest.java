package exam02;

public class RectangleTest {

	public static void main(String[] args) {
		Rectangle r = new Rectangle();
		r.setWidth(20);
		r.setLength(30);
		
		System.out.println("����: " + r.getWidth()); 
		System.out.println("����: " + r.getLength());
		System.out.println("����: " + r.calcArea());
		
		

	}

}
