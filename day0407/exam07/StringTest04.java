package exam07;

import java.util.Scanner;

//����ڿ��� ���ڿ��� �Է¹��� �Է¹��� ���ڿ����� �ҹ��� a�� ��� �� �� �ִ��� �Ǻ��Ͽ� ����ϴ� ���α׷�

public class StringTest04 {

	public static void main(String[] args) {
//		String data = new String("hello java");

//		char ch = data.charAt(4); //4��° �ִ� ���ڸ� ���
//		System.out.println(ch);

		String data;
		int cnt = 0;
		Scanner sc = new Scanner(System.in);

		System.out.print("���ڿ��� �Է��ϼ���: ");
		data = sc.next();

		int n = data.length();
		System.out.println("�Է��� ���ڿ��� ����: " + n);

		for (int i = 0; i < data.length(); i++) {
			char ch = data.charAt(i);
			if(ch == 'a') {
				cnt++;
			}
		}
		
		System.out.println("�Է��� ���ڿ��� �ҹ��� a�� ��: " + cnt);
	}
}
