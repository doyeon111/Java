package day0328;

import java.util.Scanner;

public class practice06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String drive, dir, file, a; //각각의 변수
		
		System.out.print("드라이브 이름: ");
		drive = sc.next();
		System.out.print("디렉터리 이름: ");
		dir = sc.next();
		System.out.print("파일 이름: ");
		file = sc.next();
		System.out.print("확장자: ");
		a = sc.next();
		
		System.out.print("완전한 이름은 " + drive +":" + dir + file + "." + a);

	}

}
