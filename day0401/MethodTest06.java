package day0401;

//�� ���� ������ �Ű������� ���޹޾� �� �߿� ū ���� ã�� ����ϴ� �޼ҵ带 ����
public class MethodTest06 {
	public static void max(int a, int b) {
		int r;
		if (a > b) {
			r = a;
		} else {
			r = b;
		}
		System.out.println("ū ���� " + r + "�Դϴ�.");
	}

	public static void main(String[] args) {
		max(3, 4);

	}

}
