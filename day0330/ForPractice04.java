//사용자에게 n을 입력받아 다음과 같이 n!을 구하여 출력하는 프로그램

package day0330;

import java.util.Scanner;

public class ForPractice04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n;
		int sum = 1;
		
		System.out.print("n을 입력하세요: ");
		n = sc.nextInt();
		
		for(int i = n; i >= 1; i--) { //i가 n부터 1보다 큰 i값을 실행 
			sum *= i; //i를 누적으로 곱하기
			System.out.print(i);
			if(i != 1) { //i가 1이 아니면 *을 출력
				System.out.print("*");
			}
		}
		System.out.print("=" + sum);
	} 

}
