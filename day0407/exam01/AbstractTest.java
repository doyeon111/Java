package exam01;

abstract class A { // A클래스는 추상클래스이고, 추상메소드를 가지고있다.

	public void test() {// 추상클래스는 추상메소드 뿐 아니라 body가 구체화된 메소드를 포함할 수 있다.
		System.out.println("test입니다.");
	}

	public abstract void pro(); // 추상메소드
}

class B extends A {

	@Override
	public void pro() {
		System.out.println("B의 pro입니다.");
	}

}

public class AbstractTest {

	public static void main(String[] args) {
		// A ob = new A(); //객체화 될 수 없다. 추상클래스의 객체는 생성할 수 없다.
//		B ob = new B();
//		ob.pro();
		
		A ob = new B();
		ob.pro(); //b의 구체화된 pro가 동작이 된다.
	}

}
 
