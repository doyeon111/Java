package day0330;

import java.util.Scanner;

public class SwitchPractice08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int m, date = 31;
		//30: 4, 6, 9, 11
		//31: 1, 3, 5, 7, 8, 10, 12
		//28: 2
		
		System.out.print("월을 입력하세요: ");
		m = sc.nextInt();
		
//		if (m >= 1 && m <= 12) {
//			switch (m) {
//			case 1,3,5,7,8,10,12: System.out.print(m + "월은 31일까지 있어요!"); break;
//			case 2: System.out.print(m + "월은 28일까지 있어요!"); break;
//			case 4,6,9,11: System.out.print(m + "월은 30일까지 있어요!"); break;
//
//			}
//		} else {
//			System.out.println("입력 범위를 벗어났습니다.");
//		}
		
		if (m < 1 || m > 12) {
			System.out.println("입력 범위를 넘었습니다.");
			return;
		}
		switch (m) {
		case 2: date = 28; //2월은 28일까지
		case 4,6,9,11: date = 30;
		} System.out.println(m + "월은 " + date + "일 까지 있어요!");
	}

}
