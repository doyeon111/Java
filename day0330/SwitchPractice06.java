package day0330;

import java.util.Scanner;

public class SwitchPractice06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int m;
		String result="";
		
		System.out.print("���� �Է��ϼ���: ");
		m = sc.nextInt();
		
		if(m >= 1 && m <= 12) {
			switch (m) {
				case 3,4,5: result="��"; break;
				case 6,7,8: result="����"; break;
				case 9,10,11: result="����"; break;
				case 12,1,2:result="�ܿ�"; break;
				
			}  	System.out.println(m + "���� " + result + "�Դϴ�.");
		} else {
			System.out.println("�Է¹����� ������ϴ�.");
		}
		
	}

}
