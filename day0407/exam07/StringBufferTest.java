package exam07;

public class StringBufferTest {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("hello");
//		sb = sb + " Java"; ����
		sb.append(" java"); // �����ִ� ��ü�� java�� �߰�(append)
		System.out.println(sb);

		String str = "hello";
		str = str + " java";
		// String�� �⺻�ڷ���ó�� ��밡���ϴ�.

	}

	// StringBuffer �� append�� ���Ͽ� ���ڿ��� �߰��ϸ� ���ο� ��ü�� ��������� ���� �ƴ϶�, ���� ��ü�� ���ڿ��� �߰��ȴ�.

}
