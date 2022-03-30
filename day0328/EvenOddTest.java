package day0328;

import java.util.Scanner;

public class EvenOddTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n;
		
		String result = "";
		
		System.out.print("숫자를 입력하세요: ");
		n = sc.nextInt();
		
		if ( n % 2 == 0) {
			result = "짝수";
		} else {
			result = "홀수";
		}

		System.out.println(n + "은 " + result + "입니다.");
	}

}
