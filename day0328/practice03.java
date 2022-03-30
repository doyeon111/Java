package day0328;

import java.util.Scanner;

public class practice03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x, y, add, m, g, max, min;
		double avg;
		
		System.out.print("x: ");
		x = sc.nextInt();
		System.out.print("y: ");
		y = sc.nextInt();
		
		add = x + y; //x,y를 더한 값
		m = x - y; //x,y를 뺀 값
		g = x * y; //x,y를 곱한 값
		avg = add / 2; //x,y의 평균 값
		
		System.out.println("두 수의 합: " + add);
		System.out.println("두 수의 차: " + m);
		System.out.println("두 수의 곱: " + g);
		System.out.println("두 수의 평균: " + avg);
		
		max = (x>y) ? x:y; //x,y 중 큰 값
		min = (x<y) ? x:y; //x,y 중 작은 값
		
		System.out.println("큰 수: " + max);
		System.out.println("작은 수: " + min);
		
		
		
		
		
		
		
		
	}
}
