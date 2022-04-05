package exam11;
//pdf 04번 문제
//우리가 클래스를 만들 때에 setter와 getter를 일일이 만들려니 번거롭다.(생성자도 마찬가지)
//이클립스가 자동으로 생성 (마우스 오른쪽 단추 + source + Generate getters and setters)
//생성자 (마우스 오른쪽 단추 + source + Generate Constuctor using Fiels... 매개변수 갖는 생성자
//							   + Generate Constuctor from Superclass ... 매개변수 없는 생성자
public class Box {

	private double width, length, height, volume;
	
	public void calcVolume() {
		volume = width * length * height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getHeight() {
		return height;
	} 

	public void setHeight(double height) {
		this.height = height;
	}

	public double getVolume() {
		return volume;
	}

	public Box(double width, double length, double height) {

		this.width = width;
		this.length = length;
		this.height = height;
	}
	
	public Box() {
		width = 10;
		length = 10;
		height = 10;
	}

	
	
}
