package day0331;

public class Practice129_07 {

	public static void main(String[] args) {
		System.out.print("2���� 100������ ��� �Ҽ�: ");
		int k = 2;
		do {
			int j = 2;
			do {
				if (k % 2 == 0) {//�ϳ��� ���������� ���� ������ ��������.
					break;
				}
				j++;
			} while (j < k);
			if (k == j) {
				System.out.print(j + " ");
			}
			k++;

		} while (k <= 100);

	}

}
