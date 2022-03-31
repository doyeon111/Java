package day0329;

import java.util.Scanner;

public class LogicalUsingBit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int age;
		double height;
		
		System.out.print("나이를 입력하세요: ");
		age = sc.nextInt();
		System.out.print("키를 입력하세요: ");
		height = sc.nextInt();
		
		if(age >= 30 & height <= 160) { // & 논리곱 연산자 -> 논리연산자로 사용가능하다.
			System.out.println("입장가능");
		} else {
			System.out.println("입장불가능");
		}
	}

}
