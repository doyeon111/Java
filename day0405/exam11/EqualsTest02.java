package exam11;

class Box {
	double width, length, height;

	public Box(double width, double length, double height) {
		this.width = width;
		this.length = length;
		this.height = height;
	}

	public boolean equals(Object b) {
		boolean f = false;
		Box b2 = (Box)b; // 이것을 선언해줘야 name과 age를 사용할 수 있다.

		if (width == b2.width && length == b2.length && height == b2.height) {
			f = true;
		}
		return f;
	}
	

}

public class EqualsTest02 {

	public static void main(String[] args) {
		Box b1 = new Box(10, 20, 30);
		Box b2 = new Box(10, 20, 30);

		// Box 클래스에 equal 메소드를 재정의 해보기.
		if (b1.equals(b2)) { // ==과 같음
			System.out.println("같아요"); 
		} else {
			System.out.println("달라요"); // 오버라이딩을 하지 않았기 때문에 달라요가 출력된다.
		}

	}

}
