package day0330;

public class Practice04 {

	public static void main(String[] args) {
		int sum = 0;
		for(int i=1; i<=100; i++) { //1���� 100���� ����
			if(i % 3 == 0 || i % 4 == 0) { //3�� ��� �Ǵ� 4�� ���
				sum += i; // ������� ��
			}
		}
		System.out.println("3 �Ǵ� 4�� ����� ��: " + sum);

	}

}
