package exam02;

public class RectangleTest {

	public static void main(String[] args) {
		Rectangle r = new Rectangle();
		r.setWidth(20);
		r.setLength(30);
		
		System.out.println("가로: " + r.getWidth()); 
		System.out.println("세로: " + r.getLength());
		System.out.println("넓이: " + r.calcArea());
		
		

	}

}
