package day0328;

import java.util.Scanner;

public class EvenOddTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n;
		
		String result = "";
		
		System.out.print("���ڸ� �Է��ϼ���: ");
		n = sc.nextInt();
		
		if ( n % 2 == 0) {
			result = "¦��";
		} else {
			result = "Ȧ��";
		}

		System.out.println(n + "�� " + result + "�Դϴ�.");
	}

}
