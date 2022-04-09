package practice370;

import java.util.Scanner;

public class practice01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String str;
		int cnt = 0;

		System.out.print("문자열을 입력하세요: ");
		str = sc.nextLine();

		String[] arr = str.split(" "); // 문자열 분리

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ", ");
			cnt++;
		}
		System.out.println();
		System.out.println("모두 " + cnt + "개의 단어가 있습니다.");

	}

}
 
