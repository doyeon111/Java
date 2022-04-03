package day0331;

import java.util.Scanner;

public class GugudanPractice {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int dan;
		
		System.out.print("구구단 중에 몇 단을 출력할까요? ");
		dan = sc.nextInt();
		
		int i = 1;
		while(i<=9) {
			System.out.println(dan + "*" + i + "=" + (dan*i));
			i++;
		}
		
	}

}
 
