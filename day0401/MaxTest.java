package day0401;

//ū �� ã��(������ ���)
public class MaxTest {

	public static void main(String[] args) {
		int[] data = { -9, -8, -5, -15, -7 };

		// �ϴ�, �� ù��° ��Ҹ� ���� ũ�ٰ� ����.
		int max = data[0]; // ���� ū ���� ã�� max�� ���� ��

		// ������ ��� �����͸� max�� ���Ͽ� �� ���� max���� �� ũ�ٸ� �� ���� max�� �Ѵ�.
		for (int i = 1; i < data.length; i++) {
			if (data[i] > max) {
				max = data[i];
			} 
		}
		
		System.out.println("���� ū ���� " + max);
	}

}
