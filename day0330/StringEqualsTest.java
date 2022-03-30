package day0330;

import java.util.Scanner;

//사용자한테 문자열을 입력받아 그 문자열이 "hello"와 같은 지 판별하는 프로그램
public class StringEqualsTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String data;
		System.out.print("문자열을 입력하세요: ");
		data = sc.next();
		
		//if(data == "hello") {
		if(data.equals("hello")) { //문자열이 같은지 판단하려면 equals를 써야함.
			System.out.println("맞아요.");
		} else {
			System.out.println("틀려요.");
		}

	}

}
