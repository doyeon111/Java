package day0329;

import java.util.Scanner;

public class IfPractice {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n;
		
		System.out.print("숫자를 입력하세요: "); //스캐너를 이용한 입력받기
		n = sc.nextInt();
		
		if (n >= 0) { //입력받은 n이 0보다 크거나 같을 때
			System.out.println(n + 100); // n+100을 실행
		} else {
			System.out.println(n * n); // n이 0보다 크거나 같지 않으면 n*n실행
		}
		System.out.println("작업종료");
	}

}
