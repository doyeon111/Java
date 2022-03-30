package day0328;

import java.util.Scanner;

public class StudentTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String name;
		int kor, eng, math, tot, avg;
		
		System.out.print("이름을 입력하세요: ");
		name =  sc.next();
		System.out.print("국어 점수를 입력하세요: ");
		kor =  sc.nextInt();
		System.out.print("영어 점수를 입력하세요: ");
		eng =  sc.nextInt();
		System.out.print("수학 점수를 입력하세요: ");
		math =  sc.nextInt();
		
		tot = kor + eng + math; // 국어, 영어, 수학 점수의 총합
		avg = tot / 3; // 국어, 영어, 수학 점수의 평균
		
		String result = "";
		
		if (avg >= 60) { //평균이 60점 이상이면 합격
			result = "합격";
		} else {
			result ="불합격";
		}
		
		System.out.println("*** 성적 처리 결과 ***");
		System.out.println("이름: " + name);
		System.out.println("국어: " + kor);
		System.out.println("영어: " + eng);
		System.out.println("수학: " + math);
		System.out.println("총점: " + tot);
		System.out.println("평균: " + avg);
		System.out.println("결과: " + result);
		
	}

}

