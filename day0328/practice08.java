package day0328;

import java.util.Scanner;

public class practice08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double r, vol;
		
		System.out.print("���� ������: ");
		r = sc.nextDouble();
		
		vol = (r * r * r * (double)4) / (double)3; //���� ���� ����
		System.out.println("���� ����: " + vol);

	}

}
