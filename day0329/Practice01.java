package day0329;

import java.util.Scanner;

public class Practice01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a;
		
		System.out.print("������ �Է��ϼ���: ");
		a = sc.nextInt();
		
		if (a > 0 && a <= 9) {
			if (a == 1) {
				System.out.println("ONE");
			} else if (a == 2) {
				System.out.println("TWO");
			} else if (a == 3) {
				System.out.println("THREE");
			} else if (a == 4) {
				System.out.println("FOUR");
			} else if (a == 5) {
				System.out.println("FIVE");
			} else if (a == 6) {
				System.out.println("SIX");
			} else if (a == 7) {
				System.out.println("SEVEN");
			} else if (a == 8) {
				System.out.println("EIGHT");
			} else {
				System.out.println("NINE");
			}
		} else {
			System.out.println("OTHER");
		}

	}

}
