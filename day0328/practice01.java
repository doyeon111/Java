package day0328;

import java.util.Scanner;

public class practice01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int orange, a, b;
		
		System.out.print("오렌지의 개수를 입력하시오: ");
		orange = sc.nextInt();
		
		a = orange / 10;
		b = orange % 10;
		
		System.out.println(a + "박스가 필요하고 " + b + "개가 남습니다.");
		
		

	}

}
