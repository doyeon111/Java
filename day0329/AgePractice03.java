package day0329;

import java.util.Scanner;

public class AgePractice03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name;
		int age;
		double h;
		
		System.out.print("이름을 입력하세요: ");
		name = sc.next();
		System.out.print("나이를 입력하세요: ");
		age = sc.nextInt();
		System.out.print("키를 입력하세요: ");
		h = sc.nextDouble();
		
		if (age >= 30 && h <= 160) {
			System.out.println(name + "님, 입장가능");
		} else {
			System.out.println(name + "님, 입장불가능");
		}

	}

}
