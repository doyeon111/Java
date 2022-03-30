package day0330;

import java.util.Scanner;

public class ForPractice04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n;
		int sum = 1;
		
		System.out.print("n을 입력하세요: ");
		n = sc.nextInt();
		
		for(int i = n; i >= 1; i--) {
			sum *= i;
			System.out.print(i);
			if(i != 1) {
				System.out.print("*");
			}
		}
		System.out.print("=" + sum);
	} 

}
