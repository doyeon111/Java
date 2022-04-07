package exam04;

//�ϳ��� Ŭ������ ��ӹް� �� ���� �������̽��� �����ϴ� Ŭ������ ������.

class A {
	String title;
	int year;

	public void pro() {
		System.out.println("pro �Դϴ�.");
	}
}

interface B {
	public void testB();
}

interface C {
	public void testC();
}

class D extends A implements B, C { // D�� AŬ������ ���(Ȯ���ϰ�) �ް�, B,C�� �������̽��� ��ӹ޴´�.

	@Override
	public void testC() {
		System.out.println("testC �Դϴ�.");

	}

	@Override
	public void testB() {
		System.out.println("testB �Դϴ�.");

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
