package day0330;

import java.util.Scanner;

public class ForPractice01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n;
		
		System.out.print("숫자를 입력하세요: ");
		n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) { //i가 1부터 입력받은 n까지 실행
			System.out.println(i); //i를 출력
		}

	}

}
