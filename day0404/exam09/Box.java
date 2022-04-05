package exam09;
//pdf 04번 문제
//1) 다양한 생성자를 만들어 실험
//2) 생성자나 메소드의 매개변수 이름을 의미있는 이름으로 정해준다.
public class Box {
	private double width, length, height, volume;
	
	public Box() {
		width = 10;
		length = 10;
		height = 10;
	}
	
	public Box (double width, double length, double height) {
		this.width = width;
		this.length = length;
		this.height = height;
	}
	
//	public Box(double width, double length) {
//		width = 20;
//		length = 30;
//		this.height = height;
//	}
//	
//	public Box(double height) {
//		this.width = width;
//		this.length = length;
//		height = 10;
//	}
	
	public void CalcVolume() {
		volume = width * length * height;
	} 
	
	public double getCalVolume() {
		return volume;
	}
	
	public void setWidth(double width) {
		this.width = width;
	}
	
	public void setLength(double length) {
		this.length = length;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	
	public double getWidth() {
		return width;
	}
	
	public double getLength() {
		return this.length;
	}
	
	public double getHeight() {
		return this.height;
	}
}
