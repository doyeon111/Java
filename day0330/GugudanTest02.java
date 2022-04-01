package day0330;

import java.util.Scanner;

public class GugudanTest02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int dan;
		
		System.out.print("구구단 중에 몇단을 출력할까요? ");
		dan = sc.nextInt(); //구구단을 입력받음
		
		for(int i = 1 ; i <= 9; i++) { //1부터 9까지 곱하기
			System.out.println(dan + "*" + i + "=" + (dan*i));
		}

	}

}
