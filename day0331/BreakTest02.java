package day0331;

public class BreakTest02 {

	public static void main(String[] args) {
		
		int i;
		for(i=1; i<=10; i++) {
			if(i%3 == 0) {
				break;
			}
			System.out.print(i + " ");
		}
		System.out.println("����");
		System.out.println("�ݺ��� Ż�� ���� i��: " + i); //i�� 11
	}

}
