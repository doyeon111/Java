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

		System.out.println("1부터 어디까지 출력할까요? ");
		n = sc.nextInt();
		System.out.println("1부터 " + n + "까지의 합은 " + getSum(n));
		
		
		
		
		
		
		
//		int r = getSum(10);
//
//		System.out.println("1부터 10까지의 합은: " + r);
//		System.out.println("1에서 100까지의 합은: " + getSum(100));

	}

}
