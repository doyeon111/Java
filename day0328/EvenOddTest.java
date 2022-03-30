package day0328;

import java.util.Scanner;

public class EvenOddTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n;
		
		String result = "";
		
		System.out.print("숫자를 입력하세요: "); 
		n = sc.nextInt();
		
		if ( n % 2 == 0) { //n을 2로 나눴을 때 나머지가 0인 경우
			result = "짝수";
		} else {
			result = "홀수";
		}

		System.out.println(n + "은 " + result + "입니다.");
	}

}
