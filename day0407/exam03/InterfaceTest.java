package exam03;

interface A { // A라는 자료형을 만든다. (인터페이스 안에는 상수, 추상메소드만) === 완전추상
	public int a = 10; // final을 붙이지 않아도 자동 final

	public void pro(); // abstract을 붙이지 않아도 자동 abstract
}

interface B {
	public int b = 20;

	public void test();
}

class C implements A, B { // interface를 A, B 둘다 상속받는다. 인터페이스를 상속받을 에는 implements를 사용한다.

	@Override
	public void test() {
		System.out.println("test");

	}

	@Override
	public void pro() {
		System.out.println("pro");

	}

}

public class InterfaceTest {

	public static void main(String[] args) {
		C ob = new C();
		ob.pro();
		ob.test();
	}

}
 
