package day0330;

import java.util.Scanner;

public class StringCountPractice {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int cnt = 0;
		String data; 

		
		System.out.println("문자열을 입력하세요: ");
		data = sc.next();
		
		for(int i = 0; i < data.length(); i++) {
			char ch = data.charAt(i);
			if (ch == 'a') {
				cnt++;
			}
		}

			System.out.println("소문자 a의 수는 " + cnt);
		

	}

}
