package day0330;

import java.util.Scanner;

public class StringCountPractice {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int cnt = 0;
		String data; 

		
		System.out.println("문자열을 입력하세요: ");
		data = sc.next();
		
		for(int i = 0; i < data.length(); i++) { //i가 0부터 data에 있는 길이까지 실행
			char ch = data.charAt(i); // data에 있는 i를 ch에 저장
			if (ch == 'a') { //ch가 a이면 cnt 증가
				cnt++;
			}
		}

			System.out.println("소문자 a의 수는 " + cnt);
		

	}

}
