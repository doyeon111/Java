package exam03;

interface A { // A��� �ڷ����� �����. (�������̽� �ȿ��� ���, �߻�޼ҵ常) === �����߻�
	public int a = 10; // final�� ������ �ʾƵ� �ڵ� final

	public void pro(); // abstract�� ������ �ʾƵ� �ڵ� abstract
}

interface B {
	public int b = 20;

	public void test();
}

class C implements A, B { // interface�� A, B �Ѵ� ��ӹ޴´�. �������̽��� ��ӹ��� ������ implements�� ����Ѵ�.

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
