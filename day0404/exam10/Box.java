package exam10;
//pdf 04번 문제
//1) 다양한 생성자를 만들어 실험
//2) 생성자나 메소드의 매개변수 이름을 의미있는 이름으로 정해준다.
public class Box {
	private double width, length, height, volume;
	
	public Box() {
		this(10, 10, 10); //반드시 첫 번째 문장에 와야한다.
		System.out.println("매개변수가 없는 생성자가 동작하였습니다.");
	}
	
	public Box (double width, double length, double height) {
		this.width = width;
		this.length = length;
		this.height = height;
	}
	
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
		return this.width;
	}
	
	public double getLength() {
		return this.length;
	}
	
	public double getHeight() {
		return this.height;
	}
}
 
