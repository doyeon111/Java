package exam12;

//pdf 2������

class IllegalScore extends Exception { // ����� ���� ����(RuntimeException�� �ļ��� �ƴϱ� ������ ����ó���� �������)
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
				throw new IllegalScore("������ ������ ���� �����ϴ�.");
			}
			tot += s;

		}
		avg = tot / (double) score.length;

	}

	public double getAvg() {// ����� ��ȯ
		return avg;
	}
}

public class ProcessScoreTest {

	public static void main(String[] args) {
		try {
			int[] a = { 90, 80, 100, 80, 90, 70 };
			ProcessScore ps = new ProcessScore(a);
			System.out.println("���: " + ps.getAvg());

		} catch (IllegalScore e) {
			System.out.println("���ܹ߻�: " + e.getMessage());
		}

	}

}
