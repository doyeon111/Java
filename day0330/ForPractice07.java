package day0330;

import java.util.Scanner;

public class ForPractice07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, i; 
		
		System.out.print("n을 입력하세요: ");
		n = sc.nextInt();
		
		for(i = 2; i < n; i++) {
			if(n % i == 0) { 
				break; //하나라도 나누어 지는 것이 있으면 탈출
			}
			
		}
		//만약에 n이 소수라면 i는 n과 같을 때 반복문을 탈출 
		if(i == n) {
			System.out.println(n + "은 소수입니다.");
		} else { 
			System.out.println(n + "은 소수가 아닙니다.");
		}
	}

}
