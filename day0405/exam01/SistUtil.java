package exam01;

public class SistUtil {
	// �� ���� ������ �Ű������� ���޹޾� �� �߿� ū ���� ã�� ��ȯ�ϴ� �޼ҵ带 ����
	public int getMax(int a, int b) {
		int max;

		if (a > b) {
			max = a;
		} else {
			max = b;
		}

		return max;

	}
	// �� ���� ������ �Ű������� ���޹޾� �� �߿� ū ���� ã�� ��ȯ�ϴ� �޼ҵ带 ����

	public int getMax(int a, int b, int c) { // �Ű������� ������ �ٸ��ų� �ڷ����� �޶���Ѵ�.
		int max;

		if (a > b) {
			if (a > c) {
				max = a;
			} else {
				max = c;
			}
		} else {
			if (b > c) {
				max = b;
			} else {
				max = c;
			}
		}

		return max;
	}

	// �� ���� �Ǽ��� ������ �Ű������� ���޹޾� �� �߿� ū ���� ã�� ��ȯ�ϴ� �޼ҵ带 ����
	public double getMax(double a, double b) {
		double max;

		if (a > b) {
			max = a;
		} else {
			max = b;
		}

		return max;
	}

	// ������ �迭�� �Ű������� ���޹޾� �� �߿� ���� ū ���� ã�� ��ȯ�ϴ� �޼ҵ带 ����
	// �޼ҵ� ���� ������ ��üȭ �غ���.

	public int getMax(int[] data) {
		int max = data[0];

		for (int i = 1; i < data.length; i++) {
			if (data[i] > max) {
				max = data[i];
			}
		}

		return max;
	}

}
