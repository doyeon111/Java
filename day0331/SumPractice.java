package day0331;

import java.util.Scanner;

public class SumPractice {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a;
		int sum = 0;

		System.out.print("1���� ������ ���ұ��? ");
		a = sc.nextInt();

		int i = 1;
		do {
			sum += i; //�������� ���ϱ�
			i++;
		} while (i <= a);
		System.out.println("1���� " + a + "������ ���� " + sum + "�Դϴ�.");
	}

}
