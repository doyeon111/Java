package day0328;

import java.util.Scanner;

public class AgeTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int age;
		
		System.out.print("나이를 입력하세요: ");
		age = sc.nextInt();
		
		if (age >= 10 && age <= 19) { //10~19살 까지 
			System.out.println("10대 입니다.");
		} else {
			System.out.println("10대가 아닙니다.");
		}
		

	}

}
