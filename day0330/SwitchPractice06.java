package day0330;

import java.util.Scanner;

public class SwitchPractice06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int m;
		String result="";
		
		System.out.print("월을 입력하세요: ");
		m = sc.nextInt();
		
		if(m >= 1 && m <= 12) {
			switch (m) {
				case 3,4,5: result="봄"; break;
				case 6,7,8: result="여름"; break;
				case 9,10,11: result="가을"; break;
				case 12,1,2:result="겨울"; break;
				
			}  	System.out.println(m + "월은 " + result + "입니다.");
		} else {
			System.out.println("입력범위를 벗어났습니다.");
		}
		
	}

}
