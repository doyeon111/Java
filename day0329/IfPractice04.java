package day0329;

import java.util.Scanner;

public class IfPractice04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int m;
		
		System.out.print("월을 입력하세요: ");
		m = sc.nextInt();
		
		if (m == 3 || m == 4 || m == 5) { //입력받은 m이 3,4,5월 일 경우 봄
			System.out.println(m + "월은 봄입니다." );
		} else if (m == 6 || m == 7 || m == 8) { //입력받은 m이 6,7,8월 일 경우 여름
			System.out.println(m + "월은 여름입니다." );
		} else if (m == 9 || m == 10 || m == 11) { //입력받은 m이 9,10,11월 일 경우 가을
			System.out.println(m + "월은 가을입니다." );
		} else if (m == 12 || m == 1 || m == 2) { ////입력받은 m이 12,1,2월 일 경우 겨울
		System.out.println(m + "월은 겨울입니다." );
		}else {
			System.out.println("잘못된 월 입력입니다.");
		}

	}

}
