package day0401;

import java.util.Scanner;

public class MethodPractice02 {
	public static int getSum(int n) {
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum += i;
		}
		return sum;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n;

		System.out.println("1���� ������ ����ұ��? ");
		n = sc.nextInt();
		System.out.println("1���� " + n + "������ ���� " + getSum(n));
		
		
		
		
		
		
		
//		int r = getSum(10);
//
//		System.out.println("1���� 10������ ����: " + r);
//		System.out.println("1���� 100������ ����: " + getSum(100));

	}

}
