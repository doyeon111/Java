package practice370;

import java.util.Scanner;

public class practice01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String str;
		int cnt = 0;

		System.out.print("���ڿ��� �Է��ϼ���: ");
		str = sc.nextLine();

		String[] arr = str.split(" "); // ���ڿ� �и�

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ", ");
			cnt++;
		}
		System.out.println();
		System.out.println("��� " + cnt + "���� �ܾ �ֽ��ϴ�.");

	}

}
