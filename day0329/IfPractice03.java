package day0329;

import java.util.Scanner;

//사용자에게 n을 입력받아 양수인지, 0인지, 음수인지 판별하는 프로그램
public class IfPractice03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n;
		
		System.out.print("숫자를 입력하세요: ");
		n = sc.nextInt();
		
		if (n > 0) {
			System.out.println("양수");
		} else if (n < 0) {
			System.out.println("음수");
		} else {
			System.out.println("영");
		}

	}

}
