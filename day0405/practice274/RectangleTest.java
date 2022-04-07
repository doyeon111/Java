package practice274;

class Rectangle {
	int width, height;
	
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}

	public Rectangle() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}

class ColorRectangle extends Rectangle{
	String color;

	public ColorRectangle() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ColorRectangle(int width, int height, String color) {
		super(width, height);
		this.color = color;
		// TODO Auto-generated constructor stub
	}
	
	
}

public class RectangleTest {

	public static void main(String[] args) {
		ColorRectangle obj = new ColorRectangle(100, 100, "blue");
		
		System.out.println("가로: " + obj.width);
		System.out.println("세로: " + obj.height);
		System.out.println("색상: " + obj.color);
		
	}

}
