package day0401;

import java.util.Scanner;

//0331 4번 숙제
public class Practice04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int []dap = {1,2,3,4,1,2,3,4,1,2}; //10개의 모범답안을 미리 생성
		int []user = new int[10];
		
		for(int i=0; i<user.length; i++) {
			System.out.print((i+1) + "번 답을 입력하세요: ");
			user[i] = sc.nextInt();
			
		}
		
		for (int i=1; i<=10; i++) { //문제를 출력
			System.out.print(i + "  "); //1~10번 문제를 출력
		}
		System.out.println(); //줄바꿈
		
		int n = 0;//정답수를 위한 n을 선언
		for(int i=0; i<10; i++) {
			if(dap[i] == user[i]) { //배열에 있는 답과 user가 쓴 답이 같을 때
				System.out.print("O  "); //O을 출력
				n++;
			} else { //같지 않다면
				System.out.print("X  "); //x를 출력
			}
		}
		
		System.out.println();
		System.out.println("정답 수:" + n);
		System.out.println("틀린답 수: " +(10-n));
	}

}
