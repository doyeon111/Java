package exam07;

import java.util.Scanner;

//사용자에게 문자열을 입력받은 입력받은 문자열에는 소문자 a가 모두 몇 개 있는지 판별하여 출력하는 프로그램

public class StringTest04 {

	public static void main(String[] args) {
//		String data = new String("hello java");

//		char ch = data.charAt(4); //4번째 있는 글자를 출력
//		System.out.println(ch);

		String data;
		int cnt = 0;
		Scanner sc = new Scanner(System.in);

		System.out.print("문자열을 입력하세요: ");
		data = sc.next();

		int n = data.length();
		System.out.println("입력한 문자열의 길이: " + n);

		for (int i = 0; i < data.length(); i++) {
			char ch = data.charAt(i);
			if(ch == 'a') {
				cnt++;
			}
		}
		
		System.out.println("입력한 문자열의 소문자 a의 수: " + cnt);
	}
}
 
