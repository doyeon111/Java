package day0401;

//각 배열에 있는 사람과 점수가 동일하다. 그 중 최고 점수인 사람의 이름을 출력하세요.
public class MaxTest02 {

	public static void main(String[] args) {
		String[] name = { "홍길동", "유관순", "이순신", "김유신", "강감찬" };
		int[] score = { 40, 70, 30, 100, 90 };

		int max = score[0]; //최고 점수를 구하기 위한 변수
		int n = 0; //최고 점수가 있는 인덱스를 구하기 위한 변수
		
		for (int i = 1; i < score.length; i++) { //i가 1부터 score의 배열 자리만큼 실행하고 i를 증감
			if (score[i] > max) { //score[i]의 값이 max보다 크다면 max의 값을 score[i]에 넣어라. 그 후에, n에 i값을 넣어라.
				max = score[i];
				n = i; 
			}
			
		}
		System.out.println("가장 큰 점수: " + max);
		System.out.println("최고 점수의 학생: " + name[n]);
	}

}
