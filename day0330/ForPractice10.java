package day0330;

import java.util.Scanner;

public class ForPractice10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a;
		
		System.out.print("�� ���� �Է��ϼ���: ");
		a = sc.nextInt();
		
		for(int i=1; i<=a; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}

	}

}
