package day0330;

import java.util.Scanner;

public class ForPractice09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a,b;
		
		System.out.print("�� ���� �Է��ϼ���: ");
		a = sc.nextInt();
		System.out.print("ĭ ���� �Է��ϼ���: ");
		b = sc.nextInt();
		
		for(int i=0; i<a; i++) {
			for(int j=0; j<b; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}

	}

}
