package day0329;

import java.util.Scanner;

public class IfPractice04_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int m;
		
		System.out.print("월을 입력하세요: ");
		m = sc.nextInt();
		
		if (m >= 1 && m <= 12) { //월을 1~12월까지 설정하기 
			if (m == 3 || m == 4 || m == 5) {
				System.out.println(m + "월은 봄입니다." );
			} else if (m == 6 || m == 7 || m == 8) {
				System.out.println(m + "월은 여름입니다." );
			} else if (m == 9 || m == 10 || m == 11) {
				System.out.println(m + "월은 가을입니다." );
			} else {
				System.out.println(m + "월은 겨울입니다." );
			}
		} else {
			System.out.println("잘못된 월 입력입니다."); //m이 설정범위를 넘으면 출력
		}
		
		}
	

}
