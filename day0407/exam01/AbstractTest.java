package exam01;

abstract class A { // AŬ������ �߻�Ŭ�����̰�, �߻�޼ҵ带 �������ִ�.

	public void test() {// �߻�Ŭ������ �߻�޼ҵ� �� �ƴ϶� body�� ��üȭ�� �޼ҵ带 ������ �� �ִ�.
		System.out.println("test�Դϴ�.");
	}

	public abstract void pro(); // �߻�޼ҵ�
}

class B extends A {

	@Override
	public void pro() {
		System.out.println("B�� pro�Դϴ�.");
	}

}

public class AbstractTest {

	public static void main(String[] args) {
		// A ob = new A(); //��üȭ �� �� ����. �߻�Ŭ������ ��ü�� ������ �� ����.
//		B ob = new B();
//		ob.pro();
		
		A ob = new B();
		ob.pro(); //b�� ��üȭ�� pro�� ������ �ȴ�.
	}

}
