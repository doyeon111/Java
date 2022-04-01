package day0401;

public class MethodTest07_Array {
	// ������ �迭�� �Ű������� ���޹޾� �� �߿� ���� ū ���� ã�� ����ϴ� �޼ҵ带 ����
	public static void printMax(int[] a) { // �迭�� ���޹ޱ�
		int max = a[0];
		for (int i = 1; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
			}
		}
		System.out.println("�迭 �߿� ���� ū ����: " + max);
	}

	public static void main(String[] args) {
		int[] data = { 9, 2, 7, 50, 6 };
		printMax(data);
	}

}
