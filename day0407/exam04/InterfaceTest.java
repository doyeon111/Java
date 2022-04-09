package exam04;

//하나의 클래스를 상속받고 두 개의 인터페이스를 구현하는 클래스를 만들어보자.

class A {
	String title;
	int year;

	public void pro() {
		System.out.println("pro 입니다.");
	}
}

interface B {
	public void testB();
}

interface C {
	public void testC();
}

class D extends A implements B, C { // D는 A클래스를 상속(확장하고) 받고, B,C의 인터페이스를 상속받는다.

	@Override
	public void testC() {
		System.out.println("testC 입니다.");

	}

	@Override
	public void testB() {
		System.out.println("testB 입니다.");

	}

}

public class InterfaceTest {

	public static void main(String[] args) {
		D ob = new D();
		ob.title = "JAVA";
		ob.year = 2022;
		ob.pro();
		ob.testB();
		ob.testC();
	}

} 
