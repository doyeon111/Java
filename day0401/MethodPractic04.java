package day0401;

public class MethodPractic04 {
	public static boolean isEquals(int[] a, int[] b) {
		boolean flag = true;
		if (a.length != b.length) { //a�迭�� ���� b �迭�� ������ ���� ������ false ��ȯ. (��)
			return false;
		}
		
		for (int i=0; i<a.length; i++) { // a�� i���� b�� i���� ���������� Ż��
			if(a[i] != b[i]) {
				flag = false;
				break;
			}
		}

		return flag; // �ϳ��� Ʋ���� ���� ������ false ��ȯ
	}

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5 };
		int[] b = { 1, 2, 3, 4, 5 };
		
		if(isEquals(a,b)) { //�� �迭�� ���� ���
			System.out.println("�� �迭�� ���ƿ�!");
		} else {
			System.out.println("�� �迭�� �޶��!");
		}

	}

}
