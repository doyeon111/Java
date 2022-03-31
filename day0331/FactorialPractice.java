package day0331;

import java.util.Scanner;

public class FactorialPractice {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		int sum=1;
		
		System.out.print("n을 입력하세요: ");
		n = sc.nextInt();
		
		int i=n; //i의 초기값이 n부터 시작
		while(i>=1) { //i가 1보다 크거나 같을때에
			sum *= i; //i를 곱한 값을 누적
			System.out.print(i);
			if(i != 1) {
				System.out.print("*");
			}
			i--;
			
		}
		System.out.print("=" + sum);
	}

}
