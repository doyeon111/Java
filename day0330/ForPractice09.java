package day0330;

import java.util.Scanner;

public class ForPractice09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a,b;
		
		System.out.print("줄 수를 입력하세요: ");
		a = sc.nextInt();
		System.out.print("칸 수를 입력하세요: ");
		b = sc.nextInt();
		
		for(int i=0; i<a; i++) {
			for(int j=0; j<b; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}

	}

}
