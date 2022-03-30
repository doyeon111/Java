package day0330;

import java.util.Scanner;

public class GugudanTest02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int dan;
		
		System.out.print("구구단 중에 몇단을 출력할까요? ");
		dan = sc.nextInt();
		
		for(int i = 1 ; i <= 9; i++) {
			System.out.println(dan + "*" + i + "=" + (dan*i));
		}

	}

}
