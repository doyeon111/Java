package exam02;
//pdf 01¹ø¹®Á¦
public class Rectangle {
	private double width;
	private double length;
	
	public double calcArea() {
		double area = width * length;
		return area;
	}
	
	public void setWidth(double w) {
		width = w;
	}
	
	public void setLength(double l) {
		length = l;
	}
	
	public double getWidth() {
		return width;
	}
	
	public double getLength() {
		return length;
	}
	
}
