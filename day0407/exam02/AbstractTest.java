package exam02;

abstract class A { // AŬ������ �߻�Ŭ�����̰�, �߻�޼ҵ带 �������ִ�.

	public void test() {// �߻�Ŭ������ �߻�޼ҵ� �� �ƴ϶� body�� ��üȭ�� �޼ҵ带 ������ �� �ִ�.
		System.out.println("test�Դϴ�.");
	}

	public abstract void pro(); // �߻�޼ҵ�

	public abstract void hello();
}

public class AbstractTest {

	public static void main(String[] args) {

		A ob = new A() { // ��ӹ޴� Ŭ���� ���� �͸�Ŭ������ ������ش�. A(�߻�Ŭ����)�� ������ �̸����� Ŭ������ ����

			@Override
			public void pro() {
				System.out.println("pro�Դϴ�.");

			} // �߻�Ŭ���� A�� ��ӹ��� �̸����� Ŭ������ �����ϸ鼭 �ٷ� ��ü�� �����Ѵ�.
				// �߻�Ŭ���� A�� �ִ� �߻�޼ҵ带 �������̵� �ؾ� �Ѵ�.

			@Override
			public void hello() { // A�� �ִ� �߻�޼ҵ�� ��� �ҷ��;� �Ѵ�.
				System.out.println("hello�Դϴ�.");
			}

		};
		ob.pro(); // b�� ��üȭ�� pro�� ������ �ȴ�.
		ob.hello();
		ob.test();
	}

}
