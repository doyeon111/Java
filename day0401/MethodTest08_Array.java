package day0401;
// �л��� �̸��迭�� �����迭�� �Ű������� ���޹޾� ������ ���� ���� �л��� �̸��� ��ȯ�ϴ� �޼ҵ带 ����(��, �ߺ��� ������ ���ٰ� ����)

public class MethodTest08_Array {
	public static String getScoreName(String[] name, int[] score) {
		String max_name = "";
		int max = score[0];
		int idx = 0; // �ε����� �ñ�
		for (int i = 1; i < score.length; i++) { // ������ ���� ��������� �ڸ��� ���ϱ�
			if (score[i] > max) {
				max = score[i];
				idx = i; // i�� �ε����� ��´�.
			}
		}
		max_name = name[idx];
		return max_name;
	}

	public static void main(String[] args) {
		String[] name = { "������", "�̼���", "ȫ�浿", "������", "������" };
		int[] score = { 60, 70, 80, 100, 50 };

		System.out.println("���� ���� ������ �л��̸���: " + getScoreName(name, score));
	}

}
