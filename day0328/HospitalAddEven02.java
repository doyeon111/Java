package day0328;

import java.util.Date;
import java.util.Scanner;

public class HospitalAddEven02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Date today = new Date(); // 지금 현재의 오늘 날짜를 가져옴.
		int thisYear = today.getYear() + 1900; //이번년도를 직접 가져옴.
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
		
		if (age >= 40 && thisYear % 2 == userYear % 2) {
			System.out.println(name + "님, 무료 암검진 대상자입니다.");
		} else {
			System.out.println(name + "님, 무료 암검진 대상자가 아닙니다.");
		}
		
		
	}

}
