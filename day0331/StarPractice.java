package day0331;

import java.util.Scanner;

public class StarPractice {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a, b;

		System.out.print("�� ���� �Է��ϼ���: ");
		a = sc.nextInt();
		System.out.print("ĭ ���� �Է��ϼ���: ");
		b = sc.nextInt();

		int i = 1;
		while (i <= a) { //1���� �Է¹��� �� �� a��ŭ ����
			int j = 1;
			while (j <= b) { //1���� �Է¹��� ĭ �� b��ŭ ����
				System.out.print("*"); 
				j++;
			}
			System.out.println("");// ���� while���� Ż���ϸ� ���� �ٷ� �Ѿ.
			i++;
		}
	}

}
