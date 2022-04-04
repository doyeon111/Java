package exam14;

class Box {
	private double width, length, height;

	public Box(double width, double length, double height) {
		super();
		this.width = width;
		this.length = length;
		this.height = height;
	}
	
}

public class BoxTest {

	public static void main(String[] args) {
		//Box b1 = new Box(); //기본생성자가 제공
		//사용자가 생성자를 한 개라도 만들기 시작하면 더 이상 "기본생성자"를 제공하지 않는다. (오류가 남)
		//내가 만든 생성자 대로만 객체를 생성하거나 필요하다면 사용자가 "기본생성자"를 만들어야한다.

	}

}
