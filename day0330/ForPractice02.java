package day0330;

import java.util.Scanner;

public class ForPractice02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n;
		int sum = 0;
		
		System.out.print("숫자를 입력하세요: ");
		n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			sum += i;
		}
		System.out.println("1에서 " + n + "까지의 합은 " + sum);
	}

}
