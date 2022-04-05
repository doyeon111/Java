package day0404;

import java.util.Scanner;

//5명의 이름, 국어, 영어, 수학을 입력받아 총점, 평균을 구하고 성적 순으로 정렬하여 출력하는 프로그램

public class StudentTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String []name = new String[5];
		int []kor = new int[5];
		int []eng = new int[5];
		int []math = new int[5];
		int []tot = new int[5];
		double []avg = new double[5];
		
		for(int i=0; i<name.length; i++) {
			System.out.print((i+1)+ "번째 학생의 이름을 입력하세요: ");
			name[i] = sc.next();
			
			System.out.print((i+1)+ "번째 학생의 국어점수를 입력하세요: ");
			kor[i] = sc.nextInt();
			
			System.out.print((i+1)+ "번째 학생의 영어점수를 입력하세요: ");
			eng[i] = sc.nextInt();
			
			System.out.print((i+1)+ "번째 학생의 수학점수를 입력하세요: ");
			math[i] = sc.nextInt();
			
			tot[i] = kor[i] + eng[i] + math[i];
			avg[i] = tot[i] / 3.0;
		}
		
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
		
		for(int i =0; i<name.length; i++) {
			System.out.println(name[i] + "\t"
								+ kor[i] + "\t"
								+ eng[i] + "\t"
								+ math[i] + "\t"
								+ tot[i] + "\t"
								+ avg[i]);
		}
		
		System.out.println("--------------------------------------------------");
		System.out.println("*** 성적 순으로 정렬 ***");
		
		//정렬
		for (int i=0; i<name.length; i++) {
			for(int j=i+1; j<name.length; j++) {
				if(tot[j] > tot[i]) { //이름, 국어, 영어, 수학, 총점, 평균도 다 바꾸어 주어야 함.
					String name_temp = name[i];
					name[i] = name[j];
					name[j] = name_temp; 
					
					int kor_temp = kor[i];
					kor[i] = kor[j];
					kor[j] = kor_temp; 
					
					int eng_temp = eng[i];
					eng[i] = eng[j];
					eng[j] = eng_temp; 
					
					int math_temp = math[i];
					math[i] = math[j];
		 			math[j] = math_temp; 
					
					int tot_temp = tot[i];
					tot[i] = tot[j];
					tot[j] = tot_temp; 
					
					double avg_temp = avg[i];
					avg[i] = avg[j];
					avg[j] = avg_temp; 
					
				}
				
				
			}
			
		}
		for(int i =0; i<name.length; i++) {
			System.out.println(name[i] + "\t"
								+ kor[i] + "\t"
								+ eng[i] + "\t"
								+ math[i] + "\t"
								+ tot[i] + "\t"
								+ avg[i]);
		}
	}

}
