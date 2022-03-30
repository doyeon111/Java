package day0330;

import java.util.Scanner;

public class ForPractice08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n; 
		
		System.out.print("n을 입력하세요: ");
		n = sc.nextInt();
		
		boolean isPrimeNumber = true;
		
		for(int i = 2; i < n; i++) {
			if(n % i == 0) {
				isPrimeNumber = false;
				break;
			}
		}
	if (isPrimeNumber == true) {
		System.out.println(n + "은 소수입니다.");
	} else {
		System.out.println(n + "은 소수가 아닙니다.");
	}
	}

}
