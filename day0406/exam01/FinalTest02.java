package exam01;


//final Ŭ������ �޼ҵ� �տ� �� ���
class A {
	public void pro() {
		System.out.println("A�� pro �Դϴ�.");
	}
	public final void hello() { //�ڽ��� �������̵� ���� ���ϰ� final ���
		System.out.println("hello �Դϴ�.");
	}
}


class B extends A {
	public void pro() {
		System.out.println("B�� pro�Դϴ�.");//�������̵���.(�ڽſ��� �°Բ�)
	}
//	public void hello() { //�θ�κ��� �������� final�޼ҵ�� �������̵� �� �� ����.
//		
//	}
}

public class FinalTest02 {

	public static void main(String[] args) {
		

	}

}
