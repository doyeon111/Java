package day0328;

import java.util.Scanner;

public class practice02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double m;
		double k = 1.609;
		double sum;
		
		System.out.print("마일을 입력하시오: ");
		m = sc.nextDouble();
		
		sum = m * k;
		
		System.out.println(m + "마일은 " + sum + "킬로미터 입니다.");
		
		

	}

}
