package day0330;

import java.util.Scanner;

public class ForPractice05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		
		System.out.print("n�� �Է��ϼ���: ");
		n = sc.nextInt();
		System.out.print(n + "�� ����� ");
		for(int i = 1; i <= n; i++) {
			if(n % i == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println("�Դϴ�.");

	}

}
