package day0328;

import java.util.Scanner;

public class practice07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int money, price, surtax, s;
		
		System.out.print("받은 돈: ");
		money = sc.nextInt();
		System.out.print("상품 가격: ");
		price = sc.nextInt();
		
		surtax = price * 10 / 100; //10% 세일했을 때의 가격
		System.out.println("부가세: " + surtax);
		s = (money - price); //받은 돈 - 상품가격을 한 잔돈의 값
		System.out.println("잔돈: " + s);		


	}

}
