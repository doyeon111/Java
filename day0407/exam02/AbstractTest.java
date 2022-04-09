package exam02;

abstract class A { // A클래스는 추상클래스이고, 추상메소드를 가지고있다.

	public void test() {// 추상클래스는 추상메소드 뿐 아니라 body가 구체화된 메소드를 포함할 수 있다.
		System.out.println("test입니다.");
	}

	public abstract void pro(); // 추상메소드

	public abstract void hello();
}

public class AbstractTest {

	public static void main(String[] args) {

		A ob = new A() { // 상속받는 클래스 없이 익명클래스를 만들어준다. A(추상클래스)를 구현한 이름없는 클래스를 정의

			@Override
			public void pro() {
				System.out.println("pro입니다.");

			} // 추상클래스 A를 상속받은 이름없는 클래스를 정의하면서 바로 객체를 생성한다.
				// 추상클래스 A에 있는 추상메소드를 오버라이딩 해야 한다.

			@Override
			public void hello() { // A에 있는 추상메소드는 모두 불러와야 한다.
				System.out.println("hello입니다.");
			}

		};
		ob.pro(); // b의 구체화된 pro가 동작이 된다.
		ob.hello();
		ob.test();
	}

}
 
