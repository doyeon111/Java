package exam14;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>(); //�ߺ��� ����ϸ� ������ �����Ѵ�.
		
		list.add("���");
		list.add("����");
		list.add("������");
		list.add("����");
		list.add("��");
		System.out.println(list);
		list.remove(1); //1��°�� �ִ� ���� ������.
		System.out.println(list);
		
		list.add(0, "ü��"); //0��° �ε����� ü�� �߰�
		System.out.println(list);
	}

}
