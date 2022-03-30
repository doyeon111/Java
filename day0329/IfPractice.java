package day0329;

import java.util.Scanner;

public class IfPractice {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n;
		
		System.out.print("숫자를 입력하세요: ");
		n = sc.nextInt();
		
		if (n >= 0) {
			System.out.println(n + 100);
		} else {
			System.out.println(n * n);
		}
		System.out.println("작업종료");
	}

}
