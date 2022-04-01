package day0330;

import java.util.Scanner;

public class ForPractice05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		
		System.out.print("n을 입력하세요: ");
		n = sc.nextInt();
		System.out.print(n + "의 약수는 ");
		for(int i = 1; i <= n; i++) {
			if(n % i == 0) { //n을 i로 나누었을 때 나머지가 0이면
				System.out.print(i + " "); //i값 출력 (약수)
			}
		}
		System.out.println("입니다.");

	}

}
