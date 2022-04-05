package day0404;

import java.util.Scanner;

public class StudentTest02 {

	public static void main(String[] args) {
		Student[] data = new Student[5]; // 아까 만들어 둔 Student.java에 있는 배열을 가져옴.
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < data.length; i++) {
			data[i] = new Student(); // 클래스의 자료형을 바로 사용할 수 없기 때문에 data[0] = new Student(); 라고 객체를 생성해줘야 사용할 수 있다.
			System.out.print((i + 1) + "번째 학생의 이름을 입력하세요: ");
			data[i].name = sc.next();

			System.out.print((i + 1) + "번째 학생의 국어점수를 입력하세요: ");
			data[i].kor = sc.nextInt();

			System.out.print((i + 1) + "번째 학생의 영어점수를 입력하세요: ");
			data[i].eng = sc.nextInt();

			System.out.print((i + 1) + "번째 학생의 수학점수를 입력하세요: ");
			data[i].math = sc.nextInt();
;

			data[i].tot = data[i].kor + data[i].eng + data[i].math;
			data[i].avg = data[i].tot / 3.0;
		}
		
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
		for(int i=0; i<data.length; i++) {
			System.out.println(data[i].name + "\t"
								+ data[i].kor + "\t"
								+ data[i].eng + "\t"
								+ data[i].math + "\t"
								+ data[i].tot + "\t"
								+ data[i].avg + "\t");
		}
		
		//정렬하기
		System.out.println("----------------------------------------------------------------");
		System.out.println("*** 성적순으로 정렬하기 ***");

		for(int i=0; i<data.length; i++) {
			for(int j=i+1; j<data.length; j++) {
				if(data[j].tot > data[i].tot) {
					Student temp = data[i]; //국어,수학,영어,총점,평균이 다 들어가 있기 때문에 Student의 temp를 만들어주면 됨.
					data[i] = data[j];
					data[j] = temp;
				}
			}
		}
		
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
		for(int i=0; i<data.length; i++) {
			System.out.println(data[i].name + "\t"
								+ data[i].kor + "\t"
								+ data[i].eng + "\t"
								+ data[i].math + "\t"
								+ data[i].tot + "\t"
								+ data[i].avg + "\t");
		}
	}

}
 
