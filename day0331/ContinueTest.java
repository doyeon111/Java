package day0331;

public class ContinueTest {

	public static void main(String[] args) {
		
		int i;
		for(i=1; i<=10; i++) {
			if(i%3==0) { //3,6,9 ����
				continue;
			}
			System.out.print(i + " ");
		}

		System.out.println("����");
		System.out.println("�ݺ��� Ż�� �Ŀ� i��: " + i); 
	}

}
