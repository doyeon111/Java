package day0330;

public class StringCountTest {

	public static void main(String[] args) {
		String data = "hello java";
		//�ݺ����� �̿��Ͽ� �� ���ھ� ������ ���

		for(int i = 0; i < data.length(); i++) {
			char ch = data.charAt(i);
			System.out.print(ch + " ");
		}
		

		
		
//		int cnt = data.length();//���ڿ��� ��� �� �������� �˷���.
//		System.out.println(cnt);
//		
//		char ch = data.charAt(0);
//		System.out.println(ch);
//		
//		
//		char ch2 = data.charAt(1);
//		System.out.println(ch2);
//		
//		char ch3 = data.charAt(5);
//		System.out.println("|" + ch3 + "|"); //���� ���ڵ� ������ �ϳ��� ���ڷ� ó����.
	}

}
