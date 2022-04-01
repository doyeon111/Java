package day0330;

import java.util.Scanner;

public class GugudanTest03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int dan;
		
		System.out.print("구구단 중에 몇단을 출력할까요? ");
		dan = sc.nextInt();
		
		//반복문에 필요한 변수를 미리 선언할 수도 있고, 필요한 곳에서 바로 선언하여 사용할 수 있다.
		//또한, 필요하다면 반복문에서 선택문을 표현할 수도 있다.
		for(int i = 9 ; i >= 1; i--) { // i가 9부터 꺼꾸로 실행
			if (i % 2 == 1) {
			System.out.println(dan + "*" + i + "=" + (dan*i));
		
			}
		}
	}

}
