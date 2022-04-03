package day0331;

import java.util.Scanner;

public class StarPractice {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a, b;

		System.out.print("줄 수를 입력하세요: ");
		a = sc.nextInt();
		System.out.print("칸 수를 입력하세요: ");
		b = sc.nextInt();

		int i = 1;
		while (i <= a) { //1부터 입력받은 줄 수 a만큼 실행
			int j = 1;
			while (j <= b) { //1부터 입력받은 칸 수 b만큼 실행
				System.out.print("*"); 
				j++;
			}
			System.out.println("");// 위쪽 while문을 탈출하면 다음 줄로 넘어감.
			i++;
		}
	}

} 
