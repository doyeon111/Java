package day0328;

import java.util.Scanner;

public class practice06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String drive, dir, file, a;
		
		System.out.print("����̺� �̸�: ");
		drive = sc.next();
		System.out.print("���͸� �̸�: ");
		dir = sc.next();
		System.out.print("���� �̸�: ");
		file = sc.next();
		System.out.print("Ȯ����: ");
		a = sc.next();
		
		System.out.print("������ �̸��� " + drive +":" + dir + file + "." + a);

	}

}
