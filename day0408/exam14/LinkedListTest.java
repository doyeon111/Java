package exam14;

import java.util.LinkedList;

public class LinkedListTest {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>(); //�ߺ��� ����ϰ� ������ �����Ѵ�.
		
		list.add("���");
		list.add("����");
		list.add("����");
		list.add("����");
		list.add("������");
		System.out.println(list);
		
		System.out.println(list.get(0));
		list.remove(1);
		System.out.println(list);
		
		list.add(0, "ü��");
		System.out.println(list);
	}

}
