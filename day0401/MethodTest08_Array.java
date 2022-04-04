package day0401;
// 학생의 이름배열과 점수배열을 매개변수로 전달받아 점수가 가장 높은 학생의 이름을 반환하는 메소드를 정의(단, 중복된 점수가 없다고 가정)

public class MethodTest08_Array {
	public static String getScoreName(String[] name, int[] score) {
		String max_name = "";
		int max = score[0];
		int idx = 0; // 인덱스가 궁금
		for (int i = 1; i < score.length; i++) { // 점수가 가장 높은사람의 자리를 구하기
			if (score[i] > max) {
				max = score[i];
				idx = i; // i를 인덱스에 담는다.
			}
		}
		max_name = name[idx];
		return max_name;
	}

	public static void main(String[] args) {
		String[] name = { "유관순", "이순신", "홍길동", "김유신", "강감찬" };
		int[] score = { 60, 70, 80, 100, 50 };

		System.out.println("가장 높은 점수의 학생이름은: " + getScoreName(name, score));
	}

}
 
