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
		
		add = x + y;
		m = x - y;
		g = x * y;
		avg = add / 2;
		
		System.out.println("�� ���� ��: " + add);
		System.out.println("�� ���� ��: " + m);
		System.out.println("�� ���� ��: " + g);
		System.out.println("�� ���� ���: " + avg);
		
		max = (x>y) ? x:y;
		min = (x<y) ? x:y;
		
		System.out.println("ū ��: " + max);
		System.out.println("���� ��: " + min);
		
		
		
		
		
		
		
		
	}
}
