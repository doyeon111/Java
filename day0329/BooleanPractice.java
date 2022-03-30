package day0329;

import java.util.Scanner;

public class BooleanPractice {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int age;
		boolean a;
		
		System.out.print("나이를 입력하세요: ");
		age = sc.nextInt();
		
		a = age >= 20; //나이가 20살 이상
		System.out.println(age + "이므로 " + a);
	}

}
