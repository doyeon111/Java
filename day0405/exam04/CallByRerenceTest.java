package exam04;

class Exam02 {
	
	//������ �迭�� �Ű������� ���޹޾� ��� ��Ҹ� ����ϴ� �޼ҵ带 ����
	public static void printArray(int []data) {
		for(int i=0; i<data.length; i++) {
			System.out.print(data[i] + "\t");
		}
		System.out.println();
	}
	
	// ������ �迭�� �Ű������� ���޹޾� ��� ��Ҹ� 1�� ������Ű�� �޼ҵ带 ����
	public static void plusOne(int[] data) {
		for (int i = 0; i < data.length; i++) {
			data[i]++;
		}
		
		System.out.println("�޼ҵ� �ȿ��� �迭�� ��� ���");
		printArray(data); //������ ������� �޼ҵ带 ���
	}
}

public class CallByRerenceTest {

	public static void main(String[] args) {
		int []arr = {10,20,30,40,50};
		System.out.println("�޼ҵ� ȣ���ϱ� ���� �迭");
		Exam02.printArray(arr);
		
		Exam02.plusOne(arr); //�޼ҵ� ȣ�⹮
		
		System.out.println("�޼ҵ� ȣ���� �� �迭");
		Exam02.printArray(arr);
		

	}

}
