package day0329;

import java.util.Scanner;

public class IfPractice02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, c, max;
		
		System.out.print("ù ��° ���ڸ� �Է��ϼ���: ");
		a = sc.nextInt();
		System.out.print("�� ��° ���ڸ� �Է��ϼ���: ");
		b = sc.nextInt();
		System.out.print("�� ��° ���ڸ� �Է��ϼ���: ");
		c = sc.nextInt();
		
		
		if (a > b) {
			if (a > c) {
				max = a;
			} else {
				max = c;
			}
		} else {
			if (b > c) {
				max = b;
			} else {
				max = c;
			}

		}
		
		System.out.println("���� ū ���� " + max);

	}
}