package day0330;

import java.util.Scanner;

public class SwitchPractice05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int m;
		
		System.out.print("월을 입력하세요: ");
		m = sc.nextInt();
		
		switch (m) {
		case 3,4,5: System.out.println(m + "월은 봄입니다."); break;
		case 6,7,8: System.out.println(m + "월은 여름입니다."); break;
		case 9,10,11: System.out.println(m + "월은 가을입니다."); break;
		case 12,1,2: System.out.println(m + "월은 겨울입니다."); break;
		default: System.out.println("범위를 벗어났습니다.");
		}
	}

}
 
