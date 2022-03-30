package day0329;

import java.util.Scanner;

public class Practice03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n,n10,n1; 
		//24
		
		System.out.print("0~99사이의 수를 입력하세요: ");
		n = sc.nextInt();
		
		if(n >= 0 && n <= 99) {
			if(n == 0) {
				System.out.println("영!");
			}else {
				n10 = n / 10;
				n1 = n % 10;
				//십의자리의 처리
				if(n10 == 0) {
					System.out.print("");
				}
				else if(n10 == 1) {
					System.out.print("십");
				}else if(n10 == 2) {
					System.out.print("이십");
				}else if(n10 == 3) {
					System.out.print("삼십");
				}else if(n10 == 4) {
					System.out.print("사십");
				}else if(n10 == 5) {
					System.out.print("오십");
				}else if(n10 == 6) {
					System.out.print("육십");
				}else if(n10 == 7) {
					System.out.print("칠십");
				}else if(n10 == 8) {
					System.out.print("팔십");
				}else if(n10 == 9) {
					System.out.print("구십");
				}
				
				//일의자리의 처리
				if(n1 == 0) {
					System.out.println("");
				}else if(n1 == 1) {
					System.out.println("일");
				}else if(n1 == 2) {
					System.out.println("이");
				}else if(n1 == 3) {
					System.out.println("삼");
				}else if(n1 == 4) {
					System.out.println("사");
				}else if(n1 == 5) {
					System.out.println("오");
				}else if(n1 == 6) {
					System.out.println("육");
				}else if(n1 == 7) {
					System.out.println("칠");
				}else if(n1 == 8) {
					System.out.println("팔");
				}else if(n1 == 9) {
					System.out.println("구");
				}
			}
		}else {
			System.out.println("잘못된 입력입니다.");
		
		}

	}

}
