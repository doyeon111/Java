package exam07;

public class DivTest07 {

	// �� ���� ������ �Ű������� ���޹޾� ������ �� ����� ����ϴ� �޼ҵ�
	public static void calcDiv(int a, int b) throws ArithmeticException { // ȣ���ϴ� ������ ���ܸ� ����

		int div = a / b;
		System.out.println("������ ���: " + div);

	}

	public static void main(String[] args) {

		try { //���⼭ ó���� ���ش�.
			calcDiv(9, 0);
		} catch (ArithmeticException e) {
			System.out.println("0���� ���� �� �����!");
		}
	}

}
