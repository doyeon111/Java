package exam14;

import java.util.ArrayList;

public class ArrayListTest02 {

	public static void main(String[] args) {
	
		ArrayList<String> data = new ArrayList<String>();
		data.add("ȫ�浿");
		data.add("010-1234-5678");
		data.add("����� ������ ������");
		
		System.out.println("�̸�: " + data.get(0));
		System.out.println("��ȭ: " + data.get(1));
		System.out.println("�ּ�: " + data.get(2));


	}

}
