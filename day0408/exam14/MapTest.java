package exam14;

import java.util.HashMap;

public class MapTest {

	public static void main(String[] args) {
		HashMap<String, String> data = new HashMap<String, String>(); //Ű�� �����Ϳ� ������ �� �ִ�.
		data.put("name", "ȫ�浿");
		data.put("phone", "010-1234-5678");
		data.put("addr", "����� ������ ������");
		
		System.out.println("�̸�: " + data.get("name"));
		System.out.println("��ȭ: " + data.get("phone"));
		System.out.println("�ּ�: " + data.get("addr"));
		
		String oldPhone = data.put("phone", "010-1234-7777");
		System.out.println(oldPhone); //�����ִ� ��ȣ�� ��ȯ��.
		System.out.println(data); //�׸��� ���ο� ������ �ٲ�.
		//�ߺ��� key�� ���� �߰��ϸ� ������ �����͸� ��ȯ�ϰ� value�� ���ο� ������ ��ȯ�Ѵ�.
		
		String title = data.get("title"); //���� Ű�� ��û�ϸ� null���� ��ȯ��.
		System.out.println(title);
		//�������� �ʴ� key�� ���� ��ȯ�ϸ� null�� ��ȯ��.

	}

}
