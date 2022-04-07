package exam07;

import java.util.Scanner;

//사용자한테 암호와 암호확인을 입력받아 서로 일치한지 확인하여 메시지를 출력하는 프로그램
public class StringTest05 {
	public static void main(String[] args) {
		String pwd, checkpwd;
		Scanner sc = new Scanner(System.in);

		System.out.print("암호를 입력하세요: ");
		pwd = sc.next();

		System.out.print("암호를 다시한번 입력하세요: ");
		checkpwd = sc.next();

		if(pwd.equals(checkpwd)) { //equals는 대소문자 구별
			System.out.println("확인되었습니다.");
		} else {
			System.out.println("암호확인이 일치하지 않습니다.");
		}
		
	}
}
