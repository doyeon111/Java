package exam14;

import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {
		TreeSet<String> set = new TreeSet<String>(); //�ߺ��� ������� �ʰ� ���������� �����Ѵ�.
		set.add("���");
		set.add("����");
		set.add("����");
		set.add("��");
		set.add("����");
		set.add("������");
		
		System.out.println(set);
	}

}
