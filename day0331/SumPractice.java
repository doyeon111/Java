package day0331;

import java.util.Scanner;

public class SumPractice {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a;
		int sum = 0;

		System.out.print("1부터 어디까지 더할까요? ");
		a = sc.nextInt();

		int i = 1;
		do {
			sum += i; //누적으로 더하기
			i++;
		} while (i <= a);
		System.out.println("1부터 " + a + "까지의 합은 " + sum + "입니다.");
	}

}
 
