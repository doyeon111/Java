package day0331;

import java.util.Scanner;

public class Practice130_12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int []data = new int[4];
		
		int total=0;
		
		for(int i=0; i<data.length;) {
			System.out.print("성적을 입력하세요: ");
			 int n = sc.nextInt(); //입력 값을 n에 저장
			 
			 if(n == -1) { //n이 -1이되면 반복을 종료
				 break;
			 } else { //n이 -1이 아니면 n에 값을 넣고 i를 증감
				 data[i]=n;
				 i++;
			 }
			 
//			if(data[i] == -1) {
//				break;
//			}

		}
		
		for(int i=0; i<data.length; i++) {
			total += data[i]; //data[i]의 총합
		}
		double avg = total / (double)data.length; //data[i]값의 평균값
		
		System.out.println("합계: " + total);
		System.out.println("평균: " + avg);

	}

}
