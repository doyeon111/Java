package day0330;

import java.util.Scanner;

public class ForPractice03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n; //사용자의 입력값 저장하기 위한 변수
		int even_sum = 0, even_cnt = 0; //sum = 짝수의 합, cnt = 짝수의 수
		int odd_sum = 0, odd_cnt = 0; // sum = 홀수의 합, cnt = 홀수의 수
		
		System.out.print("숫자를 입력하세요: ");
		n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			if (i % 2 == 0) {
				even_sum += i; //짝수의 합 누적
				even_cnt++; //짝수의 수
			} else {
				odd_sum += i; //홀수의 합 누적
				odd_cnt++; // 홀수의 수
			}
		}
			

		System.out.println("1에서 " + n + "까지의 짝수의 수:" + even_cnt);
		System.out.println("1에서 " + n + "까지의 짝수의 합:" + even_sum);
		System.out.println("1에서 " + n + "까지의 홀수의 수:" + odd_cnt);
		System.out.println("1에서 " + n + "까지의 홀수의 합:" + odd_sum);
	}

}
