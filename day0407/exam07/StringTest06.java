package exam07;

import java.util.Scanner;

//사용자한테 이름을 입력받아 김씨인지 아닌지 판별하여 메시지를 출력하는 프로그램을 작성
public class StringTest06 {

	public static void main(String[] args) {
		String name;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름을 입력하세요: "); 
		name = sc.next();
		
		
		
		if(name.startsWith("김")) { //김씨로 시작하는 단어
			System.out.println("김씨입니다.");
		} else {
			System.out.println("김씨가 아닙니다.");
		}

	}

}
 
