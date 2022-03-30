package day0330;

import java.util.Scanner;

public class ForPractice06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, cnt = 0; //n은 사용자로 부터 입력받기 위한 변수, cnt는 입력받은 n의 약수의 개수를 위한 변수
		
		System.out.print("n을 입력하세요: ");
		n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			if(n % i == 0) { //n의 약수를 구하기
				cnt++; //약수의 개수를 증가시킴.
			}
			
		}
		if(cnt == 2) { //약수의 개수가 2개이면 소수
			System.out.println(n + "은 소수입니다.");
		} else {
			System.out.println(n + "은 소수가 아닙니다.");
		}
	}

}
