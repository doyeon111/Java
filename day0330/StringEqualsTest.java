package day0330;

import java.util.Scanner;

//��������� ���ڿ��� �Է¹޾� �� ���ڿ��� "hello"�� ���� �� �Ǻ��ϴ� ���α׷�
public class StringEqualsTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String data;
		System.out.print("���ڿ��� �Է��ϼ���: ");
		data = sc.next();
		
		//if(data == "hello") {
		if(data.equals("hello")) { //���ڿ��� ������ �Ǵ��Ϸ��� equals�� �����.
			System.out.println("�¾ƿ�.");
		} else {
			System.out.println("Ʋ����.");
		}

	}

}
