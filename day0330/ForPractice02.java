package day0330;

import java.util.Scanner;

public class ForPractice02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n;
		int sum = 0;
		
		System.out.print("���ڸ� �Է��ϼ���: ");
		n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			sum += i;
		}
		System.out.println("1���� " + n + "������ ���� " + sum);
	}

}
