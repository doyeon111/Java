package exam13;

import java.util.StringTokenizer;

public class StringTokenizerTest {

	public static void main(String[] args) {
		//String data = "ȫ�浿: �̼���: ������: ������";
		String data = "ȫ�浿 �̼��� ������ ������";
		StringTokenizer st = new StringTokenizer(data, " ");
		
		
		while(st.hasMoreTokens()) { //��ū�� �ִ¸�ŭ �ϳ��� ������
			String name = st.nextToken();
			System.out.println(name);
		}
		
		
//		String a = st.nextToken(); //�ϳ��� ������ ����� , ȫ�浿
//		String b = st.nextToken(); //�̼���
//		String c = st.nextToken(); //������
//		String d = st.nextToken(); //������
//		
//		System.out.println(a);
//		System.out.println(b);
//		System.out.println(c);
//		System.out.println(d);
		
		
		
		
		

	}

}
