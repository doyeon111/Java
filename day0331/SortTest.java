package day0331;

public class SortTest {

	public static void main(String[] args) {
		int[] data = { 15, 24, 10, 18, 44, 42 };
		// ����: ���� ũ�� ������� ��ġ�ϴ� ��
		// �������� ����: ���� ���� �� ���� ������ �ϴ� ��
		// �������� ����: ���� ū �� ���� ������ �ϴ� ��

		//�����ϴ� �ݺ���
		for (int i = 0; i < data.length; i++) {
			for (int j = i + 1; j < data.length; j++) { // i+1������ ��
				if (data[j] < data[i]) {
					int temp = data[i]; //������������ ����
					data[i] = data[j];
					data[j] = temp;
				}
			} 

		}
		//����ϴ� �ݺ���
		for(int i=0; i<data.length; i++) {
			System.out.print(data[i] + " ");
		}
	}

}
