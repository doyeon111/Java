package day0329;

import java.util.Scanner;

public class AgePractice02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int firstAge, secondAge;
		
		System.out.print("첫 번째 사람의 나이를 입력하세요: ");
		firstAge = sc.nextInt();
		System.out.print("두 번째 사람의 나이를 입력하세요: ");
		secondAge = sc.nextInt();
		
		if (firstAge == secondAge) {
			System.out.println("나이가 같습니다.");
		} else {
			System.out.println("나이가 같지 않습니다.");
		}

	}

}
