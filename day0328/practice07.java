package day0328;

import java.util.Scanner;

public class practice07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int money, price, surtax, s;
		
		System.out.print("πﬁ¿∫ µ∑: ");
		money = sc.nextInt();
		System.out.print("ªÛ«∞ ∞°∞›: ");
		price = sc.nextInt();
		
		surtax = price * 10 / 100;
		System.out.println("∫Œ∞°ºº: " + surtax);
		s = (money - price);
		System.out.println("¿‹µ∑: " + s);		


	}

}
