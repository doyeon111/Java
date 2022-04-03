package day0331;

import java.util.Scanner;

public class StudentPractice {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] student = new int[5];
		int total = 0;

		for (int i = 0; i < student.length; i++) {
			System.out.print((i+1) + "번째 학생의 점수를 입력하세요: ");
			student[i] = sc.nextInt();
		}
		
		System.out.println("*** 성적 처리 결과 ***");
		
		for(int i=0; i<student.length; i++) {
			System.out.println((i+1) + "번째 학생의 점수: " + student[i]);
			total += student[i];
		}
		
		double avg = total / (double)student.length;
		System.out.println("점수의 총합: " + total);
		System.out.println("점수의 평균: " + avg);

	}

}
 
