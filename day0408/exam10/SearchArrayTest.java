package exam10;
//pdf 1������

class SearchArray {
	public void search(int[] arr, int data) {
		int i;
		for (i = 0; i < arr.length; i++) {
			if (arr[i] == data) {
				break;
			}
		}
		if (i == arr.length) {
			System.out.println("ã���� �ϴ� �����ʹ� �迭�� �����ϴ�.");
		} else {
			System.out.println("ã���� �ϴ� " + data + "�� �迭�� " + i + "��° �־��!");
		}
	}
}

public class SearchArrayTest {

	public static void main(String[] args) {
		int a[] = {10,20,30,40,50};
		SearchArray sa = new SearchArray();
		sa.search(a, 100);
		
		//ã���� �ϴ� �����Ͱ� �迭�� ���� ���� �̰��� �ܼ��� �޽����� ����� ���� ������,
		//�츮�� �̷��� ��Ȳ�� ������ ��Ȳ �� "����"�� �νĽ�Ű��.
		//�׷��� �ϱ� ���� "��������ǿ���"�� ����� �׷��� ��Ȳ�� �Ǿ��� �� ������ ���ܸ� �߻���Ų��.

	}

}
