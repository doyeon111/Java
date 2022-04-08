package practice04;

import java.util.Scanner;

//숙제4) 회원가입에 필요한 아이디, 암호, 이메일을 입력받아 출력하는 프로그램을 작성합니다. 
//단, 아이디, 암호, 이메일 형식에 맞지 않으면 제대로 된 값을 입력받을 동안 
//		무한반복하도록 합니다.
//		
//<처리조건>
//	아이디 : 6글자 이상이고 첫글자는 영문
//	암호	: 8글자 이상이고 반드시 특수문자(!@#$%^&*(),./-+)중에 하나이상을 포함해야 함.
//	이메일 : @를 포함해야 함. @앞에 적어도 2글자 이상이 와야 함.     -> ab@naver.com (@가 적어도 2보다 커야함)
//		    끝나는 패턴는  .com, co.kr로 끝나야 함.

public class JoinTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String id,pwd,email;
		
		while(true) {
			System.out.print("아이디를 입력하세요==>");
			id = sc.next();
			if(id.length() >= 6 && 
					(id.charAt(0) >= 'A' && id.charAt(0) <= 'Z' || 
					id.charAt(0) >= 'a' && id.charAt(0) <= 'z') )
				break;
			System.out.println("아이디는 6글자 이상이고 첫글자는 영문으로 입력하세요");
		}
		
		
		do {
			System.out.print("암호를 입력하세요==>");
			pwd = sc.next();
			
			String data = "!@#$%^&*(),./-+";
			boolean isFlag = false; // 특수문자가 있는지 없는지 체크
			for(int i=0; i<pwd.length(); i++) {  // 1234!@ -> 한글자씩 가져와 순회하면서 위의 특수문자가 있는지
				char p = pwd.charAt(i);
				for(int j=0; j<data.length(); j++) {
					char d = data.charAt(j);
					if(p == d) {
						isFlag = true;
						break;
					}
				}
				if(isFlag == true) {
					break;
				}
			}
			
			if(isFlag == true && pwd.length() >= 8) {
				break;
			}
			
			System.out.println("암호는 8글자 이상이고 특수문자를 포함해야 합니다.");
			System.out.println("가능한 특수문자 !@#$%^&*(),./-+");
			
		}while(true);
		
		
		do {
			System.out.print("이메일을 입력하세요==>");
			email = sc.next();
			
			int idx = email.indexOf("@");
			String []data = {".com","co.kr"};
			boolean flag = false;
			for(String end : data) {
				if(email.endsWith(end)) {
					flag = true;
					break;
				}
			}
			
			if(idx >= 2 && flag == true) {
				break;
			}
			System.out.println("올바른 이메일 형식이 아닙니다.");
			
		}while(true);
		
		System.out.println("-------------------------------------------------------");
		System.out.println("*** 가입정보는 다음과 같습니다. ***");
		System.out.println("아이디:"+id);
		System.out.println("암호:"+pwd);
		System.out.println("이메일:"+email);
		System.out.println("-------------------------------------------------------");
		
	}
}