package day0401;

//�� �迭�� �ִ� ����� ������ �����ϴ�. �� �� �ְ� ������ ����� �̸��� ����ϼ���.
public class MaxTest02 {

	public static void main(String[] args) {
		String[] name = { "ȫ�浿", "������", "�̼���", "������", "������" };
		int[] score = { 40, 70, 30, 100, 90 };

		int max = score[0]; //�ְ� ������ ���ϱ� ���� ����
		int n = 0; //�ְ� ������ �ִ� �ε����� ���ϱ� ���� ����
		
		for (int i = 1; i < score.length; i++) { //i�� 1���� score�� �迭 �ڸ���ŭ �����ϰ� i�� ����
			if (score[i] > max) { //score[i]�� ���� max���� ũ�ٸ� max�� ���� score[i]�� �־��. �� �Ŀ�, n�� i���� �־��.
				max = score[i];
				n = i; 
			}
			
		}
		System.out.println("���� ū ����: " + max);
		System.out.println("�ְ� ������ �л�: " + name[n]);
	}

}
