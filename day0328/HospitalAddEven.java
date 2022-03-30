package day0328;

import java.util.Scanner;

public class HospitalAddEven {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int thisYear = 2022; //현재년도는 2022년도
		String name;
		int userYear;
		int age;
		
		System.out.println("*** 무료 암검진 대상자 확인 프로그램 ***");
		System.out.print("이름을 입력하세요: ");
		name = sc.next();
		System.out.print("출생년도를 입력하세요: ");
		userYear = sc.nextInt();
		
		age = thisYear - userYear; //올해의 나이 구하기
		
		System.out.println("*** 결과 확인 ***");
//		System.out.println("이름: " + name);
		System.out.println("이번년도: " + thisYear);
		System.out.println("출생년도: " + userYear);
		System.out.println("나이: " + age);
		
		if (age >= 40 && thisYear % 2 == userYear % 2) { //나이가 40살 이상이고, 현재 년도와 출생년도를 나눈 나머지가 0인 경우 검진 대상자.
			System.out.println(name + "님, 무료 암검진 대상자입니다.");
		} else {
			System.out.println(name + "님, 무료 암검진 대상자가 아닙니다.");
		}
		
		
	}

}
