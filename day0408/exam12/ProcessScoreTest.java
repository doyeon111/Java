package exam12;

//pdf 2번문제

class IllegalScore extends Exception { // 사용자 정의 예외(RuntimeException의 후손이 아니기 때문에 예외처리를 해줘야함)
	public IllegalScore(String msg) {
		super(msg);
	}
}

class ProcessScore {
	double avg;

	public ProcessScore(int[] score) throws IllegalScore {
		int tot = 0;
		for (int s : score) {
			if (s < 0) {
				throw new IllegalScore("성적이 음수일 수는 없습니다.");
			}
			tot += s;

		}
		avg = tot / (double) score.length;

	}

	public double getAvg() {// 평균을 반환
		return avg;
	}
}

public class ProcessScoreTest {

	public static void main(String[] args) {
		try {
			int[] a = { 90, 80, 100, 80, 90, 70 };
			ProcessScore ps = new ProcessScore(a);
			System.out.println("평균: " + ps.getAvg());

		} catch (IllegalScore e) {
			System.out.println("예외발생: " + e.getMessage());
		}

	}

} 
