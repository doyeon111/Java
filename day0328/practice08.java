package day0328;

import java.util.Scanner;

public class practice08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double r, vol;
		
		System.out.print("구의 반지름: ");
		r = sc.nextDouble();
		
		vol = (r * r * r * (double)4) / (double)3; //구의 부피 공식
		System.out.println("구의 부피: " + vol);

	}

}
