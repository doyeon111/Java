package day0329;

public class CharactorTest {

	public static void main(String[] args) {
		char a = 'ȫ';
		String b = "ȫ�浿";
		String c = "ȫ";
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
//		char d = "ȫ"; ������
//		String e = 'ȫ'; ����
		
		String data = "hello";
		char first = data.charAt(0); //hello ���ڿ����� ���ڸ� ��ȯ(0���� �ε��� �̹Ƿ� h�� ��ȯ)
		System.out.println(first);
	}

}
