package day0329;

import java.util.Scanner;

public class IfPractice02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, c, max;
		
		System.out.print("첫 번째 숫자를 입력하세요: ");
		a = sc.nextInt();
		System.out.print("두 번째 숫자를 입력하세요: ");
		b = sc.nextInt();
		System.out.print("세 번째 숫자를 입력하세요: ");
		c = sc.nextInt();
		
		
		if (a > b) { //a와b를 비교하여 a가 더 클 경우
			if (a > c) { //a와 c를 비교하여 a가 클 경우
				max = a; //a가 가장 큰 수이다.
			} else {
				max = c; //a와 c를 비교하여 c가 클경우는 c가 max
			}
		} else { //a와 b를 비교하여 b가 더 클 경우
			if (b > c) { //b와 c를 비교하여 b가 더 클 경우
				max = b; //b가 최대값
			} else { //b와 c를 비교하여 c가 더 클 경우
				max = c; // c의 값이 max
			}

		}
		
		System.out.println("가장 큰 수는 " + max);

	}
}
