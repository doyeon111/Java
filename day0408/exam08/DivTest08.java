package exam08;

//ArithmeticException�� RuntimeException�� �ļ��̴�.
// RuntimeException�� ���� ����ó���� ���� �ʾƵ� �������� �ǰ� ������ �ȴ�.
//�ʿ��ϴٸ� ����ڰ� ���� ����ó�� �� �� �ִ�.
public class DivTest08 {

	// �� ���� ������ �Ű������� ���޹޾� ������ �� ����� ����ϴ� �޼ҵ�
	public static void calcDiv(int a, int b) throws ArithmeticException { // ȣ���ϴ� ������ ���ܸ� ����

		int div = a / b;
		System.out.println("������ ���: " + div);

	}

	public static void main(String[] args) {

			calcDiv(9, 0);
		
	}

}
